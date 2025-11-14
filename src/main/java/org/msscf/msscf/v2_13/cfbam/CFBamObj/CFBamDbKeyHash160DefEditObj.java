// Description: Java 11 edit object instance implementation for CFBam DbKeyHash160Def.

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

public class CFBamDbKeyHash160DefEditObj
	extends CFBamAtomEditObj

	implements ICFBamDbKeyHash160DefEditObj
{

	public CFBamDbKeyHash160DefEditObj( ICFBamDbKeyHash160DefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamDbKeyHash160DefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DbKeyHash160Def" );
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
		ICFBamDbKeyHash160DefObj retobj = getSchema().getDbKeyHash160DefTableObj().realiseDbKeyHash160Def( (ICFBamDbKeyHash160DefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDbKeyHash160Def().forget();
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
		ICFBamDbKeyHash160DefObj retobj = ((ICFBamSchemaObj)getOrigAsDbKeyHash160Def().getSchema()).getDbKeyHash160DefTableObj().createDbKeyHash160Def( getOrigAsDbKeyHash160Def() );
		if( retobj == getOrigAsDbKeyHash160Def() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getDbKeyHash160DefTableObj().updateDbKeyHash160Def( (ICFBamDbKeyHash160DefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDbKeyHash160DefTableObj().deleteDbKeyHash160Def( getOrigAsDbKeyHash160Def() );
		return( null );
	}

	public ICFBamDbKeyHash160DefTableObj getDbKeyHash160DefTable() {
		return( orig.getSchema().getDbKeyHash160DefTableObj() );
	}

	public ICFBamDbKeyHash160DefEditObj getEditAsDbKeyHash160Def() {
		return( (ICFBamDbKeyHash160DefEditObj)this );
	}

	public ICFBamDbKeyHash160DefObj getOrigAsDbKeyHash160Def() {
		return( (ICFBamDbKeyHash160DefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDbKeyHash160Def().getSchema().getBackingStore()).getFactoryDbKeyHash160Def().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamDbKeyHash160DefBuff getDbKeyHash160DefBuff() {
		return( (CFBamDbKeyHash160DefBuff)getBuff() );
	}

	public String getOptionalInitValue() {
		return( getDbKeyHash160DefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( String value ) {
		if( getDbKeyHash160DefBuff().getOptionalInitValue() != value ) {
			getDbKeyHash160DefBuff().setOptionalInitValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamDbKeyHash160DefBuff origBuff = getOrigAsDbKeyHash160Def().getDbKeyHash160DefBuff();
		CFBamDbKeyHash160DefBuff myBuff = getDbKeyHash160DefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDbKeyHash160DefBuff origBuff = getOrigAsDbKeyHash160Def().getDbKeyHash160DefBuff();
		CFBamDbKeyHash160DefBuff myBuff = getDbKeyHash160DefBuff();
		myBuff.set( origBuff );
	}
}
