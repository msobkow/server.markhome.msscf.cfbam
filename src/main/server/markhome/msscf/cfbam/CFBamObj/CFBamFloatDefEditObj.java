// Description: Java 11 edit object instance implementation for CFBam FloatDef.

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

public class CFBamFloatDefEditObj
	extends CFBamAtomEditObj

	implements ICFBamFloatDefEditObj
{

	public CFBamFloatDefEditObj( ICFBamFloatDefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamFloatDefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "FloatDef" );
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
		ICFBamFloatDefObj retobj = getSchema().getFloatDefTableObj().realiseFloatDef( (ICFBamFloatDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsFloatDef().forget();
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
		ICFBamFloatDefObj retobj = ((ICFBamSchemaObj)getOrigAsFloatDef().getSchema()).getFloatDefTableObj().createFloatDef( getOrigAsFloatDef() );
		if( retobj == getOrigAsFloatDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getFloatDefTableObj().updateFloatDef( (ICFBamFloatDefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getFloatDefTableObj().deleteFloatDef( getOrigAsFloatDef() );
		return( null );
	}

	public ICFBamFloatDefTableObj getFloatDefTable() {
		return( orig.getSchema().getFloatDefTableObj() );
	}

	public ICFBamFloatDefEditObj getEditAsFloatDef() {
		return( (ICFBamFloatDefEditObj)this );
	}

	public ICFBamFloatDefObj getOrigAsFloatDef() {
		return( (ICFBamFloatDefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsFloatDef().getSchema().getBackingStore()).getFactoryFloatDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamFloatDefBuff getFloatDefBuff() {
		return( (CFBamFloatDefBuff)getBuff() );
	}

	public Float getOptionalInitValue() {
		return( getFloatDefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( Float value ) {
		if( getFloatDefBuff().getOptionalInitValue() != value ) {
			getFloatDefBuff().setOptionalInitValue( value );
		}
	}

	public Float getOptionalMinValue() {
		return( getFloatDefBuff().getOptionalMinValue() );
	}

	public void setOptionalMinValue( Float value ) {
		if( getFloatDefBuff().getOptionalMinValue() != value ) {
			getFloatDefBuff().setOptionalMinValue( value );
		}
	}

	public Float getOptionalMaxValue() {
		return( getFloatDefBuff().getOptionalMaxValue() );
	}

	public void setOptionalMaxValue( Float value ) {
		if( getFloatDefBuff().getOptionalMaxValue() != value ) {
			getFloatDefBuff().setOptionalMaxValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamFloatDefBuff origBuff = getOrigAsFloatDef().getFloatDefBuff();
		CFBamFloatDefBuff myBuff = getFloatDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamFloatDefBuff origBuff = getOrigAsFloatDef().getFloatDefBuff();
		CFBamFloatDefBuff myBuff = getFloatDefBuff();
		myBuff.set( origBuff );
	}
}
