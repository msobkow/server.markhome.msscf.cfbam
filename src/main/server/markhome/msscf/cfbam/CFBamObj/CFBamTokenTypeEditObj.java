// Description: Java 11 edit object instance implementation for CFBam TokenType.

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

public class CFBamTokenTypeEditObj
	extends CFBamTokenDefEditObj

	implements ICFBamTokenTypeEditObj
{
	protected ICFBamSchemaDefObj requiredContainerSchemaDef;

	public CFBamTokenTypeEditObj( ICFBamTokenTypeObj argOrig ) {
		super( argOrig );
		requiredContainerSchemaDef = null;
	}

	public String getClassCode() {
		return( CFBamTokenTypeObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TokenType" );
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
		ICFBamTokenTypeObj retobj = getSchema().getTokenTypeTableObj().realiseTokenType( (ICFBamTokenTypeObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTokenType().forget();
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
		ICFBamTokenTypeObj retobj = ((ICFBamSchemaObj)getOrigAsTokenType().getSchema()).getTokenTypeTableObj().createTokenType( getOrigAsTokenType() );
		if( retobj == getOrigAsTokenType() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getTokenTypeTableObj().updateTokenType( (ICFBamTokenTypeObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTokenTypeTableObj().deleteTokenType( getOrigAsTokenType() );
		return( null );
	}

	public ICFBamTokenTypeTableObj getTokenTypeTable() {
		return( orig.getSchema().getTokenTypeTableObj() );
	}

	public ICFBamTokenTypeEditObj getEditAsTokenType() {
		return( (ICFBamTokenTypeEditObj)this );
	}

	public ICFBamTokenTypeObj getOrigAsTokenType() {
		return( (ICFBamTokenTypeObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsTokenType().getSchema().getBackingStore()).getFactoryTokenType().newBuff();
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

	public CFBamTokenTypeBuff getTokenTypeBuff() {
		return( (CFBamTokenTypeBuff)getBuff() );
	}

	public long getRequiredSchemaDefId() {
		return( getTokenTypeBuff().getRequiredSchemaDefId() );
	}

	public void setRequiredContainerScope( ICFBamScopeObj value ) {
		final String S_ProcName = "CFBamTokenTypeEditObj.setRequiredContainerScope() ";
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
				ICFBamSchemaDefObj obj = ((ICFBamSchemaObj)getOrigAsTokenType().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getPKey().getRequiredTenantId(),
					getTokenTypeBuff().getRequiredSchemaDefId() );
				requiredContainerSchemaDef = obj;
				if( obj != null ) {
					getTokenTypeBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTokenTypeBuff().setRequiredSchemaDefId( obj.getRequiredId() );
					requiredContainerSchemaDef = obj;
				}
			}
		}
		return( requiredContainerSchemaDef );
	}

	public void setRequiredContainerSchemaDef( ICFBamSchemaDefObj value ) {
			if( buff == null ) {
				getTokenTypeBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTokenTypeBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTokenTypeBuff().setRequiredSchemaDefId( value.getRequiredId() );
			}
			requiredContainerSchemaDef = value;
			super.setRequiredContainerScope( value );
	}

	public void copyBuffToOrig() {
		CFBamTokenTypeBuff origBuff = getOrigAsTokenType().getTokenTypeBuff();
		CFBamTokenTypeBuff myBuff = getTokenTypeBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamTokenTypeBuff origBuff = getOrigAsTokenType().getTokenTypeBuff();
		CFBamTokenTypeBuff myBuff = getTokenTypeBuff();
		myBuff.set( origBuff );
	}
}
