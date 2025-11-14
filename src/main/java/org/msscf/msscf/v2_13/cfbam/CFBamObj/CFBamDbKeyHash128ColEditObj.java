// Description: Java 11 edit object instance implementation for CFBam DbKeyHash128Col.

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

public class CFBamDbKeyHash128ColEditObj
	extends CFBamDbKeyHash128DefEditObj

	implements ICFBamDbKeyHash128ColEditObj
{
	protected ICFBamTableObj requiredContainerTable;

	public CFBamDbKeyHash128ColEditObj( ICFBamDbKeyHash128ColObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
	}

	public String getClassCode() {
		return( CFBamDbKeyHash128ColObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DbKeyHash128Col" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamTableObj scope = getRequiredContainerTable();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamTableObj scope = getRequiredContainerTable();
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
		ICFBamDbKeyHash128ColObj retobj = getSchema().getDbKeyHash128ColTableObj().realiseDbKeyHash128Col( (ICFBamDbKeyHash128ColObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDbKeyHash128Col().forget();
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
		ICFBamDbKeyHash128ColObj retobj = ((ICFBamSchemaObj)getOrigAsDbKeyHash128Col().getSchema()).getDbKeyHash128ColTableObj().createDbKeyHash128Col( getOrigAsDbKeyHash128Col() );
		if( retobj == getOrigAsDbKeyHash128Col() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getDbKeyHash128ColTableObj().updateDbKeyHash128Col( (ICFBamDbKeyHash128ColObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDbKeyHash128ColTableObj().deleteDbKeyHash128Col( getOrigAsDbKeyHash128Col() );
		return( null );
	}

	public ICFBamDbKeyHash128ColTableObj getDbKeyHash128ColTable() {
		return( orig.getSchema().getDbKeyHash128ColTableObj() );
	}

	public ICFBamDbKeyHash128ColEditObj getEditAsDbKeyHash128Col() {
		return( (ICFBamDbKeyHash128ColEditObj)this );
	}

	public ICFBamDbKeyHash128ColObj getOrigAsDbKeyHash128Col() {
		return( (ICFBamDbKeyHash128ColObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDbKeyHash128Col().getSchema().getBackingStore()).getFactoryDbKeyHash128Col().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerTable = null;
		}
	}

	public CFBamDbKeyHash128ColBuff getDbKeyHash128ColBuff() {
		return( (CFBamDbKeyHash128ColBuff)getBuff() );
	}

	public long getRequiredTableId() {
		return( getDbKeyHash128ColBuff().getRequiredTableId() );
	}

	public void setRequiredContainerScope( ICFBamScopeObj value ) {
		final String S_ProcName = "CFBamDbKeyHash128ColEditObj.setRequiredContainerScope() ";
		if( value == null ) {
			setRequiredContainerTable( null );
		}
		else if( ! ( value instanceof ICFBamTableObj ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setRequiredContainerScope",
				"value",
				value,
				"ICFBamTableObj" );
		}
		else {
			setRequiredContainerTable( (ICFBamTableObj)value );
		}
	}

	public ICFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public ICFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsDbKeyHash128Col().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getDbKeyHash128ColBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getDbKeyHash128ColBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getDbKeyHash128ColBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( ICFBamTableObj value ) {
			if( buff == null ) {
				getDbKeyHash128ColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getDbKeyHash128ColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getDbKeyHash128ColBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
			super.setRequiredContainerScope( value );
	}

	public void copyBuffToOrig() {
		CFBamDbKeyHash128ColBuff origBuff = getOrigAsDbKeyHash128Col().getDbKeyHash128ColBuff();
		CFBamDbKeyHash128ColBuff myBuff = getDbKeyHash128ColBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDbKeyHash128ColBuff origBuff = getOrigAsDbKeyHash128Col().getDbKeyHash128ColBuff();
		CFBamDbKeyHash128ColBuff myBuff = getDbKeyHash128ColBuff();
		myBuff.set( origBuff );
	}
}
