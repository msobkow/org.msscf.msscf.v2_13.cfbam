// Description: Java 11 implementation of a Uuid6Gen buffer object.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2020 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFBam 2.13 Business Application Model
 *	
 *	Copyright 2020 Mark Stephen Sobkow
 *	
 *		This file is part of MSS Code Factory.
 *	
 *		MSS Code Factory is available under dual commercial license from Mark Stephen
 *		Sobkow, or under the terms of the GNU General Public License, Version 3
 *		or later.
 *	
 *	    MSS Code Factory is free software: you can redistribute it and/or modify
 *	    it under the terms of the GNU General Public License as published by
 *	    the Free Software Foundation, either version 3 of the License, or
 *	    (at your option) any later version.
 *	
 *	    MSS Code Factory is distributed in the hope that it will be useful,
 *	    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	    GNU General Public License for more details.
 *	
 *	    You should have received a copy of the GNU General Public License
 *	    along with MSS Code Factory.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	Donations to support MSS Code Factory can be made at
 *	https://www.paypal.com/paypalme2/MarkSobkow
 *	
 *	Please contact Mark Stephen Sobkow at mark.sobkow@gmail.com for commercial licensing.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBam;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;

public class CFBamUuid6GenBuff
	extends CFBamUuid6TypeBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a889";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final short SLICE_INIT_VALUE = (short)0;
	public static final int BLOCKSIZE_INIT_VALUE = 1;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final short SLICE_MIN_VALUE = (short)0;
	public static final int BLOCKSIZE_MIN_VALUE = 1;
	public static final short SLICE_MAX_VALUE = (short)32767;
	public static final int BLOCKSIZE_MAX_VALUE = 2147483647;
	protected short requiredSlice;
	protected int requiredBlockSize;
	public CFBamUuid6GenBuff() {
		super();
		requiredSlice = CFBamUuid6GenBuff.SLICE_INIT_VALUE;
		requiredBlockSize = CFBamUuid6GenBuff.BLOCKSIZE_INIT_VALUE;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public short getRequiredSlice() {
		return( requiredSlice );
	}

	public void setRequiredSlice( short value ) {
		if( value < CFBamUuid6GenBuff.SLICE_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSlice",
				1,
				"value",
				value,
				CFBamUuid6GenBuff.SLICE_MIN_VALUE );
		}
		if( value > CFBamUuid6GenBuff.SLICE_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredSlice",
				1,
				"value",
				value,
				CFBamUuid6GenBuff.SLICE_MAX_VALUE );
		}
		requiredSlice = value;
	}

	public int getRequiredBlockSize() {
		return( requiredBlockSize );
	}

	public void setRequiredBlockSize( int value ) {
		if( value < CFBamUuid6GenBuff.BLOCKSIZE_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredBlockSize",
				1,
				"value",
				value,
				CFBamUuid6GenBuff.BLOCKSIZE_MIN_VALUE );
		}
		if( value > CFBamUuid6GenBuff.BLOCKSIZE_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredBlockSize",
				1,
				"value",
				value,
				CFBamUuid6GenBuff.BLOCKSIZE_MAX_VALUE );
		}
		requiredBlockSize = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamUuid6GenBuff ) {
			CFBamUuid6GenBuff rhs = (CFBamUuid6GenBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredSlice() != rhs.getRequiredSlice() ) {
				return( false );
			}
			if( getRequiredBlockSize() != rhs.getRequiredBlockSize() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamValuePKey ) {
			CFBamValuePKey rhs = (CFBamValuePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamUuid6GenHBuff ) {
			CFBamUuid6GenHBuff rhs = (CFBamUuid6GenHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredSlice() != rhs.getRequiredSlice() ) {
				return( false );
			}
			if( getRequiredBlockSize() != rhs.getRequiredBlockSize() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamValueHPKey ) {
			CFBamValueHPKey rhs = (CFBamValueHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = ( hashCode * 0x10000 ) + getRequiredSlice();
		hashCode = hashCode + getRequiredBlockSize();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamUuid6GenBuff ) {
			CFBamUuid6GenBuff rhs = (CFBamUuid6GenBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredSlice() < rhs.getRequiredSlice() ) {
				return( -1 );
			}
			else if( getRequiredSlice() > rhs.getRequiredSlice() ) {
				return( 1 );
			}
			if( getRequiredBlockSize() < rhs.getRequiredBlockSize() ) {
				return( -1 );
			}
			else if( getRequiredBlockSize() > rhs.getRequiredBlockSize() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamValuePKey ) {
			CFBamValuePKey rhs = (CFBamValuePKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamValueHPKey ) {
			CFBamValueHPKey rhs = (CFBamValueHPKey)obj;
			{
				int lhsRequiredRevision = getRequiredRevision();
				int rhsRequiredRevision = rhs.getRequiredRevision();
				if( lhsRequiredRevision < rhsRequiredRevision ) {
					return( -1 );
				}
				else if( lhsRequiredRevision > rhsRequiredRevision ) {
					return( 1 );
				}
			}
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamUuid6GenHBuff ) {
			CFBamUuid6GenHBuff rhs = (CFBamUuid6GenHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredSlice() < rhs.getRequiredSlice() ) {
				return( -1 );
			}
			else if( getRequiredSlice() > rhs.getRequiredSlice() ) {
				return( 1 );
			}
			if( getRequiredBlockSize() < rhs.getRequiredBlockSize() ) {
				return( -1 );
			}
			else if( getRequiredBlockSize() > rhs.getRequiredBlockSize() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFBamValueBuff src ) {
		if( src instanceof CFBamUuid6GenBuff ) {
			setUuid6GenBuff( (CFBamUuid6GenBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamUuid6GenBuff" );
		}
	}

	public void setUuid6GenBuff( CFBamUuid6GenBuff src ) {
		super.setUuid6TypeBuff( src );
		setRequiredSlice( src.getRequiredSlice() );
		setRequiredBlockSize( src.getRequiredBlockSize() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamUuid6GenHBuff ) {
			setUuid6GenBuff( (CFBamUuid6GenHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamUuid6GenHBuff" );
		}
	}

	public void setUuid6GenBuff( CFBamUuid6GenHBuff src ) {
		super.setUuid6TypeBuff( src );
		setRequiredSlice( src.getRequiredSlice() );
		setRequiredBlockSize( src.getRequiredBlockSize() );
	}
}
