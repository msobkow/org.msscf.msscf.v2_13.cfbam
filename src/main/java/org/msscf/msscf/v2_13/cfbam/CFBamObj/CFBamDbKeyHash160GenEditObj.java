// Description: Java 11 edit object instance implementation for CFBam DbKeyHash160Gen.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFBam 2.13 Business Application Model
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamDbKeyHash160GenEditObj
	extends CFBamDbKeyHash160TypeEditObj

	implements ICFBamDbKeyHash160GenEditObj
{
	protected ICFBamTableObj optionalLookupDispenser;

	public CFBamDbKeyHash160GenEditObj( ICFBamDbKeyHash160GenObj argOrig ) {
		super( argOrig );
		optionalLookupDispenser = null;
	}

	public String getClassCode() {
		return( CFBamDbKeyHash160GenObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DbKeyHash160Gen" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public ICFBamValueObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamDbKeyHash160GenObj retobj = getSchema().getDbKeyHash160GenTableObj().realiseDbKeyHash160Gen( (ICFBamDbKeyHash160GenObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDbKeyHash160Gen().forget();
	}

	public ICFBamValueObj moveUp() {
		throw new CFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj moveDown() {
		throw new CFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj create() {
		copyBuffToOrig();
		ICFBamDbKeyHash160GenObj retobj = ((ICFBamSchemaObj)getOrigAsDbKeyHash160Gen().getSchema()).getDbKeyHash160GenTableObj().createDbKeyHash160Gen( getOrigAsDbKeyHash160Gen() );
		if( retobj == getOrigAsDbKeyHash160Gen() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getDbKeyHash160GenTableObj().updateDbKeyHash160Gen( (ICFBamDbKeyHash160GenObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDbKeyHash160GenTableObj().deleteDbKeyHash160Gen( getOrigAsDbKeyHash160Gen() );
		return( null );
	}

	public ICFBamDbKeyHash160GenTableObj getDbKeyHash160GenTable() {
		return( orig.getSchema().getDbKeyHash160GenTableObj() );
	}

	public ICFBamDbKeyHash160GenEditObj getEditAsDbKeyHash160Gen() {
		return( (ICFBamDbKeyHash160GenEditObj)this );
	}

	public ICFBamDbKeyHash160GenObj getOrigAsDbKeyHash160Gen() {
		return( (ICFBamDbKeyHash160GenObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDbKeyHash160Gen().getSchema().getBackingStore()).getFactoryDbKeyHash160Gen().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupDispenser = null;
		}
	}

	public CFBamDbKeyHash160GenBuff getDbKeyHash160GenBuff() {
		return( (CFBamDbKeyHash160GenBuff)getBuff() );
	}

	public Long getOptionalDispenserTenantId() {
		return( getDbKeyHash160GenBuff().getOptionalDispenserTenantId() );
	}

	public Long getOptionalDispenserId() {
		return( getDbKeyHash160GenBuff().getOptionalDispenserId() );
	}

	public short getRequiredSlice() {
		return( getDbKeyHash160GenBuff().getRequiredSlice() );
	}

	public void setRequiredSlice( short value ) {
		if( getDbKeyHash160GenBuff().getRequiredSlice() != value ) {
			getDbKeyHash160GenBuff().setRequiredSlice( value );
		}
	}

	public int getRequiredBlockSize() {
		return( getDbKeyHash160GenBuff().getRequiredBlockSize() );
	}

	public void setRequiredBlockSize( int value ) {
		if( getDbKeyHash160GenBuff().getRequiredBlockSize() != value ) {
			getDbKeyHash160GenBuff().setRequiredBlockSize( value );
		}
	}

	public ICFBamTableObj getOptionalLookupDispenser() {
		return( getOptionalLookupDispenser( false ) );
	}

	public ICFBamTableObj getOptionalLookupDispenser( boolean forceRead ) {
		if( forceRead || ( optionalLookupDispenser == null ) ) {
			boolean anyMissing = false;
			if( getDbKeyHash160GenBuff().getOptionalDispenserTenantId() == null ) {
				anyMissing = true;
			}
			if( getDbKeyHash160GenBuff().getOptionalDispenserId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsDbKeyHash160Gen().getSchema()).getTableTableObj().readTableByIdIdx( getDbKeyHash160GenBuff().getOptionalDispenserTenantId(),
					getDbKeyHash160GenBuff().getOptionalDispenserId() );
				optionalLookupDispenser = obj;
			}
		}
		return( optionalLookupDispenser );
	}

	public void setOptionalLookupDispenser( ICFBamTableObj value ) {
			if( buff == null ) {
				getDbKeyHash160GenBuff();
			}
			if( value != null ) {
				getDbKeyHash160GenBuff().setOptionalDispenserTenantId( value.getRequiredTenantId() );
				getDbKeyHash160GenBuff().setOptionalDispenserId( value.getRequiredId() );
			}
			else {
				getDbKeyHash160GenBuff().setOptionalDispenserTenantId( null );
				getDbKeyHash160GenBuff().setOptionalDispenserId( null );
			}
			optionalLookupDispenser = value;
	}

	public void copyBuffToOrig() {
		CFBamDbKeyHash160GenBuff origBuff = getOrigAsDbKeyHash160Gen().getDbKeyHash160GenBuff();
		CFBamDbKeyHash160GenBuff myBuff = getDbKeyHash160GenBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDbKeyHash160GenBuff origBuff = getOrigAsDbKeyHash160Gen().getDbKeyHash160GenBuff();
		CFBamDbKeyHash160GenBuff myBuff = getDbKeyHash160GenBuff();
		myBuff.set( origBuff );
	}
}
