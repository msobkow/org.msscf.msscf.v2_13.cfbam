// Description: Java 11 edit object instance implementation for CFBam DbKeyHash384Def.

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

public class CFBamDbKeyHash384DefEditObj
	extends CFBamAtomEditObj

	implements ICFBamDbKeyHash384DefEditObj
{

	public CFBamDbKeyHash384DefEditObj( ICFBamDbKeyHash384DefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamDbKeyHash384DefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DbKeyHash384Def" );
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
		ICFBamDbKeyHash384DefObj retobj = getSchema().getDbKeyHash384DefTableObj().realiseDbKeyHash384Def( (ICFBamDbKeyHash384DefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDbKeyHash384Def().forget();
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
		ICFBamDbKeyHash384DefObj retobj = ((ICFBamSchemaObj)getOrigAsDbKeyHash384Def().getSchema()).getDbKeyHash384DefTableObj().createDbKeyHash384Def( getOrigAsDbKeyHash384Def() );
		if( retobj == getOrigAsDbKeyHash384Def() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getDbKeyHash384DefTableObj().updateDbKeyHash384Def( (ICFBamDbKeyHash384DefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDbKeyHash384DefTableObj().deleteDbKeyHash384Def( getOrigAsDbKeyHash384Def() );
		return( null );
	}

	public ICFBamDbKeyHash384DefTableObj getDbKeyHash384DefTable() {
		return( orig.getSchema().getDbKeyHash384DefTableObj() );
	}

	public ICFBamDbKeyHash384DefEditObj getEditAsDbKeyHash384Def() {
		return( (ICFBamDbKeyHash384DefEditObj)this );
	}

	public ICFBamDbKeyHash384DefObj getOrigAsDbKeyHash384Def() {
		return( (ICFBamDbKeyHash384DefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDbKeyHash384Def().getSchema().getBackingStore()).getFactoryDbKeyHash384Def().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamDbKeyHash384DefBuff getDbKeyHash384DefBuff() {
		return( (CFBamDbKeyHash384DefBuff)getBuff() );
	}

	public String getOptionalInitValue() {
		return( getDbKeyHash384DefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( String value ) {
		if( getDbKeyHash384DefBuff().getOptionalInitValue() != value ) {
			getDbKeyHash384DefBuff().setOptionalInitValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamDbKeyHash384DefBuff origBuff = getOrigAsDbKeyHash384Def().getDbKeyHash384DefBuff();
		CFBamDbKeyHash384DefBuff myBuff = getDbKeyHash384DefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDbKeyHash384DefBuff origBuff = getOrigAsDbKeyHash384Def().getDbKeyHash384DefBuff();
		CFBamDbKeyHash384DefBuff myBuff = getDbKeyHash384DefBuff();
		myBuff.set( origBuff );
	}
}
