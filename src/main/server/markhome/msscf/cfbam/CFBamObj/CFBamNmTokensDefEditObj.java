// Description: Java 11 edit object instance implementation for CFBam NmTokensDef.

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

public class CFBamNmTokensDefEditObj
	extends CFBamAtomEditObj

	implements ICFBamNmTokensDefEditObj
{

	public CFBamNmTokensDefEditObj( ICFBamNmTokensDefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamNmTokensDefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "NmTokensDef" );
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
		ICFBamNmTokensDefObj retobj = getSchema().getNmTokensDefTableObj().realiseNmTokensDef( (ICFBamNmTokensDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsNmTokensDef().forget();
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
		ICFBamNmTokensDefObj retobj = ((ICFBamSchemaObj)getOrigAsNmTokensDef().getSchema()).getNmTokensDefTableObj().createNmTokensDef( getOrigAsNmTokensDef() );
		if( retobj == getOrigAsNmTokensDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getNmTokensDefTableObj().updateNmTokensDef( (ICFBamNmTokensDefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getNmTokensDefTableObj().deleteNmTokensDef( getOrigAsNmTokensDef() );
		return( null );
	}

	public ICFBamNmTokensDefTableObj getNmTokensDefTable() {
		return( orig.getSchema().getNmTokensDefTableObj() );
	}

	public ICFBamNmTokensDefEditObj getEditAsNmTokensDef() {
		return( (ICFBamNmTokensDefEditObj)this );
	}

	public ICFBamNmTokensDefObj getOrigAsNmTokensDef() {
		return( (ICFBamNmTokensDefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsNmTokensDef().getSchema().getBackingStore()).getFactoryNmTokensDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamNmTokensDefBuff getNmTokensDefBuff() {
		return( (CFBamNmTokensDefBuff)getBuff() );
	}

	public int getRequiredMaxLen() {
		return( getNmTokensDefBuff().getRequiredMaxLen() );
	}

	public void setRequiredMaxLen( int value ) {
		if( getNmTokensDefBuff().getRequiredMaxLen() != value ) {
			getNmTokensDefBuff().setRequiredMaxLen( value );
		}
	}

	public String getOptionalInitValue() {
		return( getNmTokensDefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( String value ) {
		if( getNmTokensDefBuff().getOptionalInitValue() != value ) {
			getNmTokensDefBuff().setOptionalInitValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamNmTokensDefBuff origBuff = getOrigAsNmTokensDef().getNmTokensDefBuff();
		CFBamNmTokensDefBuff myBuff = getNmTokensDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamNmTokensDefBuff origBuff = getOrigAsNmTokensDef().getNmTokensDefBuff();
		CFBamNmTokensDefBuff myBuff = getNmTokensDefBuff();
		myBuff.set( origBuff );
	}
}
