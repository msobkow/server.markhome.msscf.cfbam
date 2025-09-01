// Description: Java 11 edit object instance implementation for CFBam DateType.

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

public class CFBamDateTypeEditObj
	extends CFBamDateDefEditObj

	implements ICFBamDateTypeEditObj
{
	protected ICFBamSchemaDefObj requiredContainerSchemaDef;

	public CFBamDateTypeEditObj( ICFBamDateTypeObj argOrig ) {
		super( argOrig );
		requiredContainerSchemaDef = null;
	}

	public String getClassCode() {
		return( CFBamDateTypeObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DateType" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamSchemaDefObj scope = getRequiredContainerSchemaDef();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamSchemaDefObj scope = getRequiredContainerSchemaDef();
		return( scope );
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
		ICFBamDateTypeObj retobj = getSchema().getDateTypeTableObj().realiseDateType( (ICFBamDateTypeObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDateType().forget();
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
		ICFBamDateTypeObj retobj = ((ICFBamSchemaObj)getOrigAsDateType().getSchema()).getDateTypeTableObj().createDateType( getOrigAsDateType() );
		if( retobj == getOrigAsDateType() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getDateTypeTableObj().updateDateType( (ICFBamDateTypeObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDateTypeTableObj().deleteDateType( getOrigAsDateType() );
		return( null );
	}

	public ICFBamDateTypeTableObj getDateTypeTable() {
		return( orig.getSchema().getDateTypeTableObj() );
	}

	public ICFBamDateTypeEditObj getEditAsDateType() {
		return( (ICFBamDateTypeEditObj)this );
	}

	public ICFBamDateTypeObj getOrigAsDateType() {
		return( (ICFBamDateTypeObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDateType().getSchema().getBackingStore()).getFactoryDateType().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerSchemaDef = null;
		}
	}

	public CFBamDateTypeBuff getDateTypeBuff() {
		return( (CFBamDateTypeBuff)getBuff() );
	}

	public long getRequiredSchemaDefId() {
		return( getDateTypeBuff().getRequiredSchemaDefId() );
	}

	public void setRequiredContainerScope( ICFBamScopeObj value ) {
		final String S_ProcName = "CFBamDateTypeEditObj.setRequiredContainerScope() ";
		if( value == null ) {
			setRequiredContainerSchemaDef( null );
		}
		else if( ! ( value instanceof ICFBamSchemaDefObj ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setRequiredContainerScope",
				"value",
				value,
				"ICFBamSchemaDefObj" );
		}
		else {
			setRequiredContainerSchemaDef( (ICFBamSchemaDefObj)value );
		}
	}

	public ICFBamSchemaDefObj getRequiredContainerSchemaDef() {
		return( getRequiredContainerSchemaDef( false ) );
	}

	public ICFBamSchemaDefObj getRequiredContainerSchemaDef( boolean forceRead ) {
		if( forceRead || ( requiredContainerSchemaDef == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamSchemaDefObj obj = ((ICFBamSchemaObj)getOrigAsDateType().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getPKey().getRequiredTenantId(),
					getDateTypeBuff().getRequiredSchemaDefId() );
				requiredContainerSchemaDef = obj;
				if( obj != null ) {
					getDateTypeBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getDateTypeBuff().setRequiredSchemaDefId( obj.getRequiredId() );
					requiredContainerSchemaDef = obj;
				}
			}
		}
		return( requiredContainerSchemaDef );
	}

	public void setRequiredContainerSchemaDef( ICFBamSchemaDefObj value ) {
			if( buff == null ) {
				getDateTypeBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getDateTypeBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getDateTypeBuff().setRequiredSchemaDefId( value.getRequiredId() );
			}
			requiredContainerSchemaDef = value;
			super.setRequiredContainerScope( value );
	}

	public void copyBuffToOrig() {
		CFBamDateTypeBuff origBuff = getOrigAsDateType().getDateTypeBuff();
		CFBamDateTypeBuff myBuff = getDateTypeBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDateTypeBuff origBuff = getOrigAsDateType().getDateTypeBuff();
		CFBamDateTypeBuff myBuff = getDateTypeBuff();
		myBuff.set( origBuff );
	}
}
