// Description: Java 11 edit object instance implementation for CFBam DbKeyHash512Def.

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

public class CFBamDbKeyHash512DefEditObj
	extends CFBamAtomEditObj

	implements ICFBamDbKeyHash512DefEditObj
{

	public CFBamDbKeyHash512DefEditObj( ICFBamDbKeyHash512DefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamDbKeyHash512DefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DbKeyHash512Def" );
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
		ICFBamDbKeyHash512DefObj retobj = getSchema().getDbKeyHash512DefTableObj().realiseDbKeyHash512Def( (ICFBamDbKeyHash512DefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDbKeyHash512Def().forget();
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
		ICFBamDbKeyHash512DefObj retobj = ((ICFBamSchemaObj)getOrigAsDbKeyHash512Def().getSchema()).getDbKeyHash512DefTableObj().createDbKeyHash512Def( getOrigAsDbKeyHash512Def() );
		if( retobj == getOrigAsDbKeyHash512Def() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getDbKeyHash512DefTableObj().updateDbKeyHash512Def( (ICFBamDbKeyHash512DefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDbKeyHash512DefTableObj().deleteDbKeyHash512Def( getOrigAsDbKeyHash512Def() );
		return( null );
	}

	public ICFBamDbKeyHash512DefTableObj getDbKeyHash512DefTable() {
		return( orig.getSchema().getDbKeyHash512DefTableObj() );
	}

	public ICFBamDbKeyHash512DefEditObj getEditAsDbKeyHash512Def() {
		return( (ICFBamDbKeyHash512DefEditObj)this );
	}

	public ICFBamDbKeyHash512DefObj getOrigAsDbKeyHash512Def() {
		return( (ICFBamDbKeyHash512DefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDbKeyHash512Def().getSchema().getBackingStore()).getFactoryDbKeyHash512Def().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamDbKeyHash512DefBuff getDbKeyHash512DefBuff() {
		return( (CFBamDbKeyHash512DefBuff)getBuff() );
	}

	public String getOptionalInitValue() {
		return( getDbKeyHash512DefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( String value ) {
		if( getDbKeyHash512DefBuff().getOptionalInitValue() != value ) {
			getDbKeyHash512DefBuff().setOptionalInitValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamDbKeyHash512DefBuff origBuff = getOrigAsDbKeyHash512Def().getDbKeyHash512DefBuff();
		CFBamDbKeyHash512DefBuff myBuff = getDbKeyHash512DefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDbKeyHash512DefBuff origBuff = getOrigAsDbKeyHash512Def().getDbKeyHash512DefBuff();
		CFBamDbKeyHash512DefBuff myBuff = getDbKeyHash512DefBuff();
		myBuff.set( origBuff );
	}
}
