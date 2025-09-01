// Description: Java 11 edit object instance implementation for CFBam TZTimeDef.

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

public class CFBamTZTimeDefEditObj
	extends CFBamAtomEditObj

	implements ICFBamTZTimeDefEditObj
{

	public CFBamTZTimeDefEditObj( ICFBamTZTimeDefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamTZTimeDefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TZTimeDef" );
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
		ICFBamTZTimeDefObj retobj = getSchema().getTZTimeDefTableObj().realiseTZTimeDef( (ICFBamTZTimeDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTZTimeDef().forget();
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
		ICFBamTZTimeDefObj retobj = ((ICFBamSchemaObj)getOrigAsTZTimeDef().getSchema()).getTZTimeDefTableObj().createTZTimeDef( getOrigAsTZTimeDef() );
		if( retobj == getOrigAsTZTimeDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getTZTimeDefTableObj().updateTZTimeDef( (ICFBamTZTimeDefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTZTimeDefTableObj().deleteTZTimeDef( getOrigAsTZTimeDef() );
		return( null );
	}

	public ICFBamTZTimeDefTableObj getTZTimeDefTable() {
		return( orig.getSchema().getTZTimeDefTableObj() );
	}

	public ICFBamTZTimeDefEditObj getEditAsTZTimeDef() {
		return( (ICFBamTZTimeDefEditObj)this );
	}

	public ICFBamTZTimeDefObj getOrigAsTZTimeDef() {
		return( (ICFBamTZTimeDefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsTZTimeDef().getSchema().getBackingStore()).getFactoryTZTimeDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamTZTimeDefBuff getTZTimeDefBuff() {
		return( (CFBamTZTimeDefBuff)getBuff() );
	}

	public String getOptionalDummy() {
		return( getTZTimeDefBuff().getOptionalDummy() );
	}

	public void setOptionalDummy( String value ) {
		if( getTZTimeDefBuff().getOptionalDummy() != value ) {
			getTZTimeDefBuff().setOptionalDummy( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamTZTimeDefBuff origBuff = getOrigAsTZTimeDef().getTZTimeDefBuff();
		CFBamTZTimeDefBuff myBuff = getTZTimeDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamTZTimeDefBuff origBuff = getOrigAsTZTimeDef().getTZTimeDefBuff();
		CFBamTZTimeDefBuff myBuff = getTZTimeDefBuff();
		myBuff.set( origBuff );
	}
}
