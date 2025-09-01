// Description: Java 11 edit object instance implementation for CFBam UuidDef.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public class CFBamUuidDefEditObj
	extends CFBamAtomEditObj

	implements ICFBamUuidDefEditObj
{

	public CFBamUuidDefEditObj( ICFBamUuidDefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamUuidDefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "UuidDef" );
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
		ICFBamUuidDefObj retobj = getSchema().getUuidDefTableObj().realiseUuidDef( (ICFBamUuidDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsUuidDef().forget();
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
		ICFBamUuidDefObj retobj = ((ICFBamSchemaObj)getOrigAsUuidDef().getSchema()).getUuidDefTableObj().createUuidDef( getOrigAsUuidDef() );
		if( retobj == getOrigAsUuidDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getUuidDefTableObj().updateUuidDef( (ICFBamUuidDefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getUuidDefTableObj().deleteUuidDef( getOrigAsUuidDef() );
		return( null );
	}

	public ICFBamUuidDefTableObj getUuidDefTable() {
		return( orig.getSchema().getUuidDefTableObj() );
	}

	public ICFBamUuidDefEditObj getEditAsUuidDef() {
		return( (ICFBamUuidDefEditObj)this );
	}

	public ICFBamUuidDefObj getOrigAsUuidDef() {
		return( (ICFBamUuidDefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsUuidDef().getSchema().getBackingStore()).getFactoryUuidDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamUuidDefBuff getUuidDefBuff() {
		return( (CFBamUuidDefBuff)getBuff() );
	}

	public UUID getOptionalInitValue() {
		return( getUuidDefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( UUID value ) {
		if( getUuidDefBuff().getOptionalInitValue() != value ) {
			getUuidDefBuff().setOptionalInitValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamUuidDefBuff origBuff = getOrigAsUuidDef().getUuidDefBuff();
		CFBamUuidDefBuff myBuff = getUuidDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamUuidDefBuff origBuff = getOrigAsUuidDef().getUuidDefBuff();
		CFBamUuidDefBuff myBuff = getUuidDefBuff();
		myBuff.set( origBuff );
	}
}
