// Description: Java 11 edit object instance implementation for CFBam Uuid6Gen.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2025 Mark Stephen Sobkow
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

public class CFBamUuid6GenEditObj
	extends CFBamUuid6TypeEditObj

	implements ICFBamUuid6GenEditObj
{
	protected ICFBamTableObj optionalLookupDispenser;

	public CFBamUuid6GenEditObj( ICFBamUuid6GenObj argOrig ) {
		super( argOrig );
		optionalLookupDispenser = null;
	}

	public String getClassCode() {
		return( CFBamUuid6GenObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Uuid6Gen" );
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
		ICFBamUuid6GenObj retobj = getSchema().getUuid6GenTableObj().realiseUuid6Gen( (ICFBamUuid6GenObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsUuid6Gen().forget();
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
		ICFBamUuid6GenObj retobj = ((ICFBamSchemaObj)getOrigAsUuid6Gen().getSchema()).getUuid6GenTableObj().createUuid6Gen( getOrigAsUuid6Gen() );
		if( retobj == getOrigAsUuid6Gen() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getUuid6GenTableObj().updateUuid6Gen( (ICFBamUuid6GenObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getUuid6GenTableObj().deleteUuid6Gen( getOrigAsUuid6Gen() );
		return( null );
	}

	public ICFBamUuid6GenTableObj getUuid6GenTable() {
		return( orig.getSchema().getUuid6GenTableObj() );
	}

	public ICFBamUuid6GenEditObj getEditAsUuid6Gen() {
		return( (ICFBamUuid6GenEditObj)this );
	}

	public ICFBamUuid6GenObj getOrigAsUuid6Gen() {
		return( (ICFBamUuid6GenObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsUuid6Gen().getSchema().getBackingStore()).getFactoryUuid6Gen().newBuff();
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

	public CFBamUuid6GenBuff getUuid6GenBuff() {
		return( (CFBamUuid6GenBuff)getBuff() );
	}

	public Long getOptionalDispenserTenantId() {
		return( getUuid6GenBuff().getOptionalDispenserTenantId() );
	}

	public Long getOptionalDispenserId() {
		return( getUuid6GenBuff().getOptionalDispenserId() );
	}

	public short getRequiredSlice() {
		return( getUuid6GenBuff().getRequiredSlice() );
	}

	public void setRequiredSlice( short value ) {
		if( getUuid6GenBuff().getRequiredSlice() != value ) {
			getUuid6GenBuff().setRequiredSlice( value );
		}
	}

	public int getRequiredBlockSize() {
		return( getUuid6GenBuff().getRequiredBlockSize() );
	}

	public void setRequiredBlockSize( int value ) {
		if( getUuid6GenBuff().getRequiredBlockSize() != value ) {
			getUuid6GenBuff().setRequiredBlockSize( value );
		}
	}

	public ICFBamTableObj getOptionalLookupDispenser() {
		return( getOptionalLookupDispenser( false ) );
	}

	public ICFBamTableObj getOptionalLookupDispenser( boolean forceRead ) {
		if( forceRead || ( optionalLookupDispenser == null ) ) {
			boolean anyMissing = false;
			if( getUuid6GenBuff().getOptionalDispenserTenantId() == null ) {
				anyMissing = true;
			}
			if( getUuid6GenBuff().getOptionalDispenserId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsUuid6Gen().getSchema()).getTableTableObj().readTableByIdIdx( getUuid6GenBuff().getOptionalDispenserTenantId(),
					getUuid6GenBuff().getOptionalDispenserId() );
				optionalLookupDispenser = obj;
			}
		}
		return( optionalLookupDispenser );
	}

	public void setOptionalLookupDispenser( ICFBamTableObj value ) {
			if( buff == null ) {
				getUuid6GenBuff();
			}
			if( value != null ) {
				getUuid6GenBuff().setOptionalDispenserTenantId( value.getRequiredTenantId() );
				getUuid6GenBuff().setOptionalDispenserId( value.getRequiredId() );
			}
			else {
				getUuid6GenBuff().setOptionalDispenserTenantId( null );
				getUuid6GenBuff().setOptionalDispenserId( null );
			}
			optionalLookupDispenser = value;
	}

	public void copyBuffToOrig() {
		CFBamUuid6GenBuff origBuff = getOrigAsUuid6Gen().getUuid6GenBuff();
		CFBamUuid6GenBuff myBuff = getUuid6GenBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamUuid6GenBuff origBuff = getOrigAsUuid6Gen().getUuid6GenBuff();
		CFBamUuid6GenBuff myBuff = getUuid6GenBuff();
		myBuff.set( origBuff );
	}
}
