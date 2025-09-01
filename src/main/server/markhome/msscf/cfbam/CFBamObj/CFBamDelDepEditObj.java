// Description: Java 11 edit object instance implementation for CFBam DelDep.

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

public class CFBamDelDepEditObj
	extends CFBamScopeEditObj

	implements ICFBamDelDepEditObj
{
	protected ICFBamRelationObj requiredLookupRelation;
	protected ICFBamSchemaDefObj optionalLookupDefSchema;

	public CFBamDelDepEditObj( ICFBamDelDepObj argOrig ) {
		super( argOrig );
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
	}

	public String getClassCode() {
		return( CFBamDelDepObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelDep" );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredId();
		objName = Long.toString( val );
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

	public ICFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamDelDepObj retobj = getSchema().getDelDepTableObj().realiseDelDep( (ICFBamDelDepObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDelDep().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamDelDepObj retobj = ((ICFBamSchemaObj)getOrigAsDelDep().getSchema()).getDelDepTableObj().createDelDep( getOrigAsDelDep() );
		if( retobj == getOrigAsDelDep() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getDelDepTableObj().updateDelDep( (ICFBamDelDepObj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDelDepTableObj().deleteDelDep( getOrigAsDelDep() );
		return( null );
	}

	public ICFBamDelDepTableObj getDelDepTable() {
		return( orig.getSchema().getDelDepTableObj() );
	}

	public ICFBamDelDepEditObj getEditAsDelDep() {
		return( (ICFBamDelDepEditObj)this );
	}

	public ICFBamDelDepObj getOrigAsDelDep() {
		return( (ICFBamDelDepObj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDelDep().getSchema().getBackingStore()).getFactoryDelDep().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredLookupRelation = null;
			optionalLookupDefSchema = null;
		}
	}

	public CFBamDelDepBuff getDelDepBuff() {
		return( (CFBamDelDepBuff)getBuff() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getDelDepBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getDelDepBuff().getOptionalDefSchemaId() );
	}

	public long getRequiredRelationTenantId() {
		return( getDelDepBuff().getRequiredRelationTenantId() );
	}

	public long getRequiredRelationId() {
		return( getDelDepBuff().getRequiredRelationId() );
	}

	public ICFBamRelationObj getRequiredLookupRelation() {
		return( getRequiredLookupRelation( false ) );
	}

	public ICFBamRelationObj getRequiredLookupRelation( boolean forceRead ) {
		if( forceRead || ( requiredLookupRelation == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamRelationObj obj = ((ICFBamSchemaObj)getOrigAsDelDep().getSchema()).getRelationTableObj().readRelationByIdIdx( getDelDepBuff().getRequiredRelationTenantId(),
					getDelDepBuff().getRequiredRelationId() );
				requiredLookupRelation = obj;
			}
		}
		return( requiredLookupRelation );
	}

	public void setRequiredLookupRelation( ICFBamRelationObj value ) {
			if( buff == null ) {
				getDelDepBuff();
			}
			if( value != null ) {
				getDelDepBuff().setRequiredRelationTenantId( value.getRequiredTenantId() );
				getDelDepBuff().setRequiredRelationId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupRelation = value;
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getDelDepBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getDelDepBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamSchemaDefObj obj = ((ICFBamSchemaObj)getOrigAsDelDep().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getDelDepBuff().getOptionalDefSchemaTenantId(),
					getDelDepBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( ICFBamSchemaDefObj value ) {
			if( buff == null ) {
				getDelDepBuff();
			}
			if( value != null ) {
				getDelDepBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getDelDepBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getDelDepBuff().setOptionalDefSchemaTenantId( null );
				getDelDepBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public void copyBuffToOrig() {
		CFBamDelDepBuff origBuff = getOrigAsDelDep().getDelDepBuff();
		CFBamDelDepBuff myBuff = getDelDepBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDelDepBuff origBuff = getOrigAsDelDep().getDelDepBuff();
		CFBamDelDepBuff myBuff = getDelDepBuff();
		myBuff.set( origBuff );
	}
}
