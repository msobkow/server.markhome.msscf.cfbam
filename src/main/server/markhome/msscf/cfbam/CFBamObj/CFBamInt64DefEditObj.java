// Description: Java 11 edit object instance implementation for CFBam Int64Def.

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

public class CFBamInt64DefEditObj
	extends CFBamAtomEditObj

	implements ICFBamInt64DefEditObj
{

	public CFBamInt64DefEditObj( ICFBamInt64DefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamInt64DefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Int64Def" );
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
		ICFBamInt64DefObj retobj = getSchema().getInt64DefTableObj().realiseInt64Def( (ICFBamInt64DefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsInt64Def().forget();
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
		ICFBamInt64DefObj retobj = ((ICFBamSchemaObj)getOrigAsInt64Def().getSchema()).getInt64DefTableObj().createInt64Def( getOrigAsInt64Def() );
		if( retobj == getOrigAsInt64Def() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getInt64DefTableObj().updateInt64Def( (ICFBamInt64DefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getInt64DefTableObj().deleteInt64Def( getOrigAsInt64Def() );
		return( null );
	}

	public ICFBamInt64DefTableObj getInt64DefTable() {
		return( orig.getSchema().getInt64DefTableObj() );
	}

	public ICFBamInt64DefEditObj getEditAsInt64Def() {
		return( (ICFBamInt64DefEditObj)this );
	}

	public ICFBamInt64DefObj getOrigAsInt64Def() {
		return( (ICFBamInt64DefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsInt64Def().getSchema().getBackingStore()).getFactoryInt64Def().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamInt64DefBuff getInt64DefBuff() {
		return( (CFBamInt64DefBuff)getBuff() );
	}

	public Long getOptionalInitValue() {
		return( getInt64DefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( Long value ) {
		if( getInt64DefBuff().getOptionalInitValue() != value ) {
			getInt64DefBuff().setOptionalInitValue( value );
		}
	}

	public Long getOptionalMinValue() {
		return( getInt64DefBuff().getOptionalMinValue() );
	}

	public void setOptionalMinValue( Long value ) {
		if( getInt64DefBuff().getOptionalMinValue() != value ) {
			getInt64DefBuff().setOptionalMinValue( value );
		}
	}

	public Long getOptionalMaxValue() {
		return( getInt64DefBuff().getOptionalMaxValue() );
	}

	public void setOptionalMaxValue( Long value ) {
		if( getInt64DefBuff().getOptionalMaxValue() != value ) {
			getInt64DefBuff().setOptionalMaxValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamInt64DefBuff origBuff = getOrigAsInt64Def().getInt64DefBuff();
		CFBamInt64DefBuff myBuff = getInt64DefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamInt64DefBuff origBuff = getOrigAsInt64Def().getInt64DefBuff();
		CFBamInt64DefBuff myBuff = getInt64DefBuff();
		myBuff.set( origBuff );
	}
}
