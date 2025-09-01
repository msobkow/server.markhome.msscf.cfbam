// Description: Java 11 edit object instance implementation for CFBam StringDef.

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

public class CFBamStringDefEditObj
	extends CFBamAtomEditObj

	implements ICFBamStringDefEditObj
{

	public CFBamStringDefEditObj( ICFBamStringDefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamStringDefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "StringDef" );
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
		ICFBamStringDefObj retobj = getSchema().getStringDefTableObj().realiseStringDef( (ICFBamStringDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsStringDef().forget();
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
		ICFBamStringDefObj retobj = ((ICFBamSchemaObj)getOrigAsStringDef().getSchema()).getStringDefTableObj().createStringDef( getOrigAsStringDef() );
		if( retobj == getOrigAsStringDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getStringDefTableObj().updateStringDef( (ICFBamStringDefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getStringDefTableObj().deleteStringDef( getOrigAsStringDef() );
		return( null );
	}

	public ICFBamStringDefTableObj getStringDefTable() {
		return( orig.getSchema().getStringDefTableObj() );
	}

	public ICFBamStringDefEditObj getEditAsStringDef() {
		return( (ICFBamStringDefEditObj)this );
	}

	public ICFBamStringDefObj getOrigAsStringDef() {
		return( (ICFBamStringDefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsStringDef().getSchema().getBackingStore()).getFactoryStringDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamStringDefBuff getStringDefBuff() {
		return( (CFBamStringDefBuff)getBuff() );
	}

	public int getRequiredMaxLen() {
		return( getStringDefBuff().getRequiredMaxLen() );
	}

	public void setRequiredMaxLen( int value ) {
		if( getStringDefBuff().getRequiredMaxLen() != value ) {
			getStringDefBuff().setRequiredMaxLen( value );
		}
	}

	public boolean getRequiredIsPolymorph() {
		return( getStringDefBuff().getRequiredIsPolymorph() );
	}

	public void setRequiredIsPolymorph( boolean value ) {
		if( getStringDefBuff().getRequiredIsPolymorph() != value ) {
			getStringDefBuff().setRequiredIsPolymorph( value );
		}
	}

	public String getOptionalInitValue() {
		return( getStringDefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( String value ) {
		if( getStringDefBuff().getOptionalInitValue() != value ) {
			getStringDefBuff().setOptionalInitValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamStringDefBuff origBuff = getOrigAsStringDef().getStringDefBuff();
		CFBamStringDefBuff myBuff = getStringDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamStringDefBuff origBuff = getOrigAsStringDef().getStringDefBuff();
		CFBamStringDefBuff myBuff = getStringDefBuff();
		myBuff.set( origBuff );
	}
}
