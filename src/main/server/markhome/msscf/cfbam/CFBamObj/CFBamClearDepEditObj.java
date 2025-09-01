// Description: Java 11 edit object instance implementation for CFBam ClearDep.

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

public class CFBamClearDepEditObj
	extends CFBamScopeEditObj

	implements ICFBamClearDepEditObj
{
	protected ICFBamRelationObj requiredLookupRelation;
	protected ICFBamSchemaDefObj optionalLookupDefSchema;

	public CFBamClearDepEditObj( ICFBamClearDepObj argOrig ) {
		super( argOrig );
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
	}

	public String getClassCode() {
		return( CFBamClearDepObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearDep" );
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
		ICFBamClearDepObj retobj = getSchema().getClearDepTableObj().realiseClearDep( (ICFBamClearDepObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsClearDep().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamClearDepObj retobj = ((ICFBamSchemaObj)getOrigAsClearDep().getSchema()).getClearDepTableObj().createClearDep( getOrigAsClearDep() );
		if( retobj == getOrigAsClearDep() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getClearDepTableObj().updateClearDep( (ICFBamClearDepObj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getClearDepTableObj().deleteClearDep( getOrigAsClearDep() );
		return( null );
	}

	public ICFBamClearDepTableObj getClearDepTable() {
		return( orig.getSchema().getClearDepTableObj() );
	}

	public ICFBamClearDepEditObj getEditAsClearDep() {
		return( (ICFBamClearDepEditObj)this );
	}

	public ICFBamClearDepObj getOrigAsClearDep() {
		return( (ICFBamClearDepObj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsClearDep().getSchema().getBackingStore()).getFactoryClearDep().newBuff();
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

	public CFBamClearDepBuff getClearDepBuff() {
		return( (CFBamClearDepBuff)getBuff() );
	}

	public long getRequiredRelationId() {
		return( getClearDepBuff().getRequiredRelationId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getClearDepBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getClearDepBuff().getOptionalDefSchemaId() );
	}

	public ICFBamRelationObj getRequiredLookupRelation() {
		return( getRequiredLookupRelation( false ) );
	}

	public ICFBamRelationObj getRequiredLookupRelation( boolean forceRead ) {
		if( forceRead || ( requiredLookupRelation == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamRelationObj obj = ((ICFBamSchemaObj)getOrigAsClearDep().getSchema()).getRelationTableObj().readRelationByIdIdx( getPKey().getRequiredTenantId(),
					getClearDepBuff().getRequiredRelationId() );
				requiredLookupRelation = obj;
			}
		}
		return( requiredLookupRelation );
	}

	public void setRequiredLookupRelation( ICFBamRelationObj value ) {
			if( buff == null ) {
				getClearDepBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getClearDepBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getClearDepBuff().setRequiredRelationId( value.getRequiredId() );
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
			if( getClearDepBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getClearDepBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamSchemaDefObj obj = ((ICFBamSchemaObj)getOrigAsClearDep().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getClearDepBuff().getOptionalDefSchemaTenantId(),
					getClearDepBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( ICFBamSchemaDefObj value ) {
			if( buff == null ) {
				getClearDepBuff();
			}
			if( value != null ) {
				getClearDepBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getClearDepBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getClearDepBuff().setOptionalDefSchemaTenantId( null );
				getClearDepBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public void copyBuffToOrig() {
		CFBamClearDepBuff origBuff = getOrigAsClearDep().getClearDepBuff();
		CFBamClearDepBuff myBuff = getClearDepBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamClearDepBuff origBuff = getOrigAsClearDep().getClearDepBuff();
		CFBamClearDepBuff myBuff = getClearDepBuff();
		myBuff.set( origBuff );
	}
}
