// Description: Java 11 edit object instance implementation for CFBam Int32Def.

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

public class CFBamInt32DefEditObj
	extends CFBamAtomEditObj

	implements ICFBamInt32DefEditObj
{

	public CFBamInt32DefEditObj( ICFBamInt32DefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamInt32DefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Int32Def" );
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
		ICFBamInt32DefObj retobj = getSchema().getInt32DefTableObj().realiseInt32Def( (ICFBamInt32DefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsInt32Def().forget();
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
		ICFBamInt32DefObj retobj = ((ICFBamSchemaObj)getOrigAsInt32Def().getSchema()).getInt32DefTableObj().createInt32Def( getOrigAsInt32Def() );
		if( retobj == getOrigAsInt32Def() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getInt32DefTableObj().updateInt32Def( (ICFBamInt32DefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getInt32DefTableObj().deleteInt32Def( getOrigAsInt32Def() );
		return( null );
	}

	public ICFBamInt32DefTableObj getInt32DefTable() {
		return( orig.getSchema().getInt32DefTableObj() );
	}

	public ICFBamInt32DefEditObj getEditAsInt32Def() {
		return( (ICFBamInt32DefEditObj)this );
	}

	public ICFBamInt32DefObj getOrigAsInt32Def() {
		return( (ICFBamInt32DefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsInt32Def().getSchema().getBackingStore()).getFactoryInt32Def().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamInt32DefBuff getInt32DefBuff() {
		return( (CFBamInt32DefBuff)getBuff() );
	}

	public Integer getOptionalInitValue() {
		return( getInt32DefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( Integer value ) {
		if( getInt32DefBuff().getOptionalInitValue() != value ) {
			getInt32DefBuff().setOptionalInitValue( value );
		}
	}

	public Integer getOptionalMinValue() {
		return( getInt32DefBuff().getOptionalMinValue() );
	}

	public void setOptionalMinValue( Integer value ) {
		if( getInt32DefBuff().getOptionalMinValue() != value ) {
			getInt32DefBuff().setOptionalMinValue( value );
		}
	}

	public Integer getOptionalMaxValue() {
		return( getInt32DefBuff().getOptionalMaxValue() );
	}

	public void setOptionalMaxValue( Integer value ) {
		if( getInt32DefBuff().getOptionalMaxValue() != value ) {
			getInt32DefBuff().setOptionalMaxValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamInt32DefBuff origBuff = getOrigAsInt32Def().getInt32DefBuff();
		CFBamInt32DefBuff myBuff = getInt32DefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamInt32DefBuff origBuff = getOrigAsInt32Def().getInt32DefBuff();
		CFBamInt32DefBuff myBuff = getInt32DefBuff();
		myBuff.set( origBuff );
	}
}
