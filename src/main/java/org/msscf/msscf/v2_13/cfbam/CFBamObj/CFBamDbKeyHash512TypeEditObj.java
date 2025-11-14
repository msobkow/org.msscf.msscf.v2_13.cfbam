// Description: Java 11 edit object instance implementation for CFBam DbKeyHash512Type.

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

public class CFBamDbKeyHash512TypeEditObj
	extends CFBamDbKeyHash512DefEditObj

	implements ICFBamDbKeyHash512TypeEditObj
{
	protected ICFBamSchemaDefObj requiredContainerSchemaDef;

	public CFBamDbKeyHash512TypeEditObj( ICFBamDbKeyHash512TypeObj argOrig ) {
		super( argOrig );
		requiredContainerSchemaDef = null;
	}

	public String getClassCode() {
		return( CFBamDbKeyHash512TypeObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DbKeyHash512Type" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamSchemaDefObj scope = getRequiredContainerSchemaDef();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamSchemaDefObj scope = getRequiredContainerSchemaDef();
		return( scope );
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
		ICFBamDbKeyHash512TypeObj retobj = getSchema().getDbKeyHash512TypeTableObj().realiseDbKeyHash512Type( (ICFBamDbKeyHash512TypeObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDbKeyHash512Type().forget();
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
		ICFBamDbKeyHash512TypeObj retobj = ((ICFBamSchemaObj)getOrigAsDbKeyHash512Type().getSchema()).getDbKeyHash512TypeTableObj().createDbKeyHash512Type( getOrigAsDbKeyHash512Type() );
		if( retobj == getOrigAsDbKeyHash512Type() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getDbKeyHash512TypeTableObj().updateDbKeyHash512Type( (ICFBamDbKeyHash512TypeObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDbKeyHash512TypeTableObj().deleteDbKeyHash512Type( getOrigAsDbKeyHash512Type() );
		return( null );
	}

	public ICFBamDbKeyHash512TypeTableObj getDbKeyHash512TypeTable() {
		return( orig.getSchema().getDbKeyHash512TypeTableObj() );
	}

	public ICFBamDbKeyHash512TypeEditObj getEditAsDbKeyHash512Type() {
		return( (ICFBamDbKeyHash512TypeEditObj)this );
	}

	public ICFBamDbKeyHash512TypeObj getOrigAsDbKeyHash512Type() {
		return( (ICFBamDbKeyHash512TypeObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDbKeyHash512Type().getSchema().getBackingStore()).getFactoryDbKeyHash512Type().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerSchemaDef = null;
		}
	}

	public CFBamDbKeyHash512TypeBuff getDbKeyHash512TypeBuff() {
		return( (CFBamDbKeyHash512TypeBuff)getBuff() );
	}

	public long getRequiredSchemaDefId() {
		return( getDbKeyHash512TypeBuff().getRequiredSchemaDefId() );
	}

	public void setRequiredContainerScope( ICFBamScopeObj value ) {
		final String S_ProcName = "CFBamDbKeyHash512TypeEditObj.setRequiredContainerScope() ";
		if( value == null ) {
			setRequiredContainerSchemaDef( null );
		}
		else if( ! ( value instanceof ICFBamSchemaDefObj ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setRequiredContainerScope",
				"value",
				value,
				"ICFBamSchemaDefObj" );
		}
		else {
			setRequiredContainerSchemaDef( (ICFBamSchemaDefObj)value );
		}
	}

	public ICFBamSchemaDefObj getRequiredContainerSchemaDef() {
		return( getRequiredContainerSchemaDef( false ) );
	}

	public ICFBamSchemaDefObj getRequiredContainerSchemaDef( boolean forceRead ) {
		if( forceRead || ( requiredContainerSchemaDef == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamSchemaDefObj obj = ((ICFBamSchemaObj)getOrigAsDbKeyHash512Type().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getPKey().getRequiredTenantId(),
					getDbKeyHash512TypeBuff().getRequiredSchemaDefId() );
				requiredContainerSchemaDef = obj;
				if( obj != null ) {
					getDbKeyHash512TypeBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getDbKeyHash512TypeBuff().setRequiredSchemaDefId( obj.getRequiredId() );
					requiredContainerSchemaDef = obj;
				}
			}
		}
		return( requiredContainerSchemaDef );
	}

	public void setRequiredContainerSchemaDef( ICFBamSchemaDefObj value ) {
			if( buff == null ) {
				getDbKeyHash512TypeBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getDbKeyHash512TypeBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getDbKeyHash512TypeBuff().setRequiredSchemaDefId( value.getRequiredId() );
			}
			requiredContainerSchemaDef = value;
			super.setRequiredContainerScope( value );
	}

	public void copyBuffToOrig() {
		CFBamDbKeyHash512TypeBuff origBuff = getOrigAsDbKeyHash512Type().getDbKeyHash512TypeBuff();
		CFBamDbKeyHash512TypeBuff myBuff = getDbKeyHash512TypeBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDbKeyHash512TypeBuff origBuff = getOrigAsDbKeyHash512Type().getDbKeyHash512TypeBuff();
		CFBamDbKeyHash512TypeBuff myBuff = getDbKeyHash512TypeBuff();
		myBuff.set( origBuff );
	}
}
