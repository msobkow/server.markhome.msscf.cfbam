// Description: Java 11 base object instance implementation for CFBam PopSubDep2.

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

public class CFBamPopSubDep2Obj
	extends CFBamPopDepObj
	implements ICFBamPopSubDep2Obj
{
	public final static String CLASS_CODE = "a832";
	protected ICFBamPopSubDep1Obj requiredContainerPopSubDep1;

	public CFBamPopSubDep2Obj() {
		super();
		requiredContainerPopSubDep1 = null;
	}

	public CFBamPopSubDep2Obj( ICFBamSchemaObj argSchema ) {
		super( argSchema );
		requiredContainerPopSubDep1 = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "PopSubDep2" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamPopSubDep1Obj scope = getRequiredContainerPopSubDep1();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamPopSubDep1Obj scope = getRequiredContainerPopSubDep1();
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

	public ICFBamScopeObj realise() {
		ICFBamPopSubDep2Obj retobj = ((ICFBamSchemaObj)schema).getPopSubDep2TableObj().realisePopSubDep2(
			(ICFBamPopSubDep2Obj)this );
		return( (ICFBamScopeObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getPopSubDep2TableObj().reallyDeepDisposePopSubDep2( (ICFBamPopSubDep2Obj)this );
	}

	public ICFBamScopeObj read() {
		ICFBamPopSubDep2Obj retobj = ((ICFBamSchemaObj)schema).getPopSubDep2TableObj().readPopSubDep2ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamScopeObj read( boolean forceRead ) {
		ICFBamPopSubDep2Obj retobj = ((ICFBamSchemaObj)schema).getPopSubDep2TableObj().readPopSubDep2ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamPopSubDep2TableObj getPopSubDep2Table() {
		return( ((ICFBamSchemaObj)schema).getPopSubDep2TableObj() );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFBamPopSubDep2Buff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFBamPopSubDep2Buff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
		requiredContainerPopSubDep1 = null;
	}

	public CFBamPopSubDep2Buff getPopSubDep2Buff() {
		return( (CFBamPopSubDep2Buff)getBuff() );
	}

	public ICFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFBamPopSubDep2Obj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFBamPopSubDep2Obj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getPopSubDep2TableObj().lockPopSubDep2( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getPopSubDep2TableObj().newEditInstance( lockobj );
		return( (ICFBamScopeEditObj)edit );
	}

	public ICFBamPopSubDep2EditObj getEditAsPopSubDep2() {
		return( (ICFBamPopSubDep2EditObj)edit );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFBamScopeBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFBamScopeBuff buff = getBuff();
			updatedBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredPopSubDep1TenantId() {
		return( getPopSubDep2Buff().getRequiredPopSubDep1TenantId() );
	}

	public long getRequiredPopSubDep1Id() {
		return( getPopSubDep2Buff().getRequiredPopSubDep1Id() );
	}

	public String getRequiredName() {
		return( getPopSubDep2Buff().getRequiredName() );
	}

	public ICFBamPopSubDep1Obj getRequiredContainerPopSubDep1() {
		return( getRequiredContainerPopSubDep1( false ) );
	}

	public ICFBamPopSubDep1Obj getRequiredContainerPopSubDep1( boolean forceRead ) {
		if( ( requiredContainerPopSubDep1 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerPopSubDep1 = ((ICFBamSchemaObj)schema).getPopSubDep1TableObj().readPopSubDep1ByIdIdx( getPopSubDep2Buff().getRequiredPopSubDep1TenantId(),
					getPopSubDep2Buff().getRequiredPopSubDep1Id(), forceRead );
			}
		}
		return( requiredContainerPopSubDep1 );
	}

	public List<ICFBamPopSubDep3Obj> getOptionalComponentsPopDep() {
		List<ICFBamPopSubDep3Obj> retval;
		retval = ((ICFBamSchemaObj)schema).getPopSubDep3TableObj().readPopSubDep3ByPopSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamPopSubDep3Obj> getOptionalComponentsPopDep( boolean forceRead ) {
		List<ICFBamPopSubDep3Obj> retval;
		retval = ((ICFBamSchemaObj)schema).getPopSubDep3TableObj().readPopSubDep3ByPopSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}
}
