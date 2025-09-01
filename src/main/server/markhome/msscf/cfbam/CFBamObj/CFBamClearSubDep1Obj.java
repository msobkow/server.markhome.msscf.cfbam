// Description: Java 11 base object instance implementation for CFBam ClearSubDep1.

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

public class CFBamClearSubDep1Obj
	extends CFBamClearDepObj
	implements ICFBamClearSubDep1Obj
{
	public final static String CLASS_CODE = "a811";
	protected ICFBamClearTopDepObj requiredContainerClearTopDep;

	public CFBamClearSubDep1Obj() {
		super();
		requiredContainerClearTopDep = null;
	}

	public CFBamClearSubDep1Obj( ICFBamSchemaObj argSchema ) {
		super( argSchema );
		requiredContainerClearTopDep = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearSubDep1" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamClearTopDepObj scope = getRequiredContainerClearTopDep();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamClearTopDepObj scope = getRequiredContainerClearTopDep();
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
		ICFBamClearSubDep1Obj retobj = ((ICFBamSchemaObj)schema).getClearSubDep1TableObj().realiseClearSubDep1(
			(ICFBamClearSubDep1Obj)this );
		return( (ICFBamScopeObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getClearSubDep1TableObj().reallyDeepDisposeClearSubDep1( (ICFBamClearSubDep1Obj)this );
	}

	public ICFBamScopeObj read() {
		ICFBamClearSubDep1Obj retobj = ((ICFBamSchemaObj)schema).getClearSubDep1TableObj().readClearSubDep1ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamScopeObj read( boolean forceRead ) {
		ICFBamClearSubDep1Obj retobj = ((ICFBamSchemaObj)schema).getClearSubDep1TableObj().readClearSubDep1ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamClearSubDep1TableObj getClearSubDep1Table() {
		return( ((ICFBamSchemaObj)schema).getClearSubDep1TableObj() );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableClearSubDep1().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof CFBamClearSubDep1Buff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFBamClearSubDep1Buff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
		requiredContainerClearTopDep = null;
	}

	public CFBamClearSubDep1Buff getClearSubDep1Buff() {
		return( (CFBamClearSubDep1Buff)getBuff() );
	}

	public ICFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFBamClearSubDep1Obj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFBamClearSubDep1Obj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getClearSubDep1TableObj().lockClearSubDep1( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getClearSubDep1TableObj().newEditInstance( lockobj );
		return( (ICFBamScopeEditObj)edit );
	}

	public ICFBamClearSubDep1EditObj getEditAsClearSubDep1() {
		return( (ICFBamClearSubDep1EditObj)edit );
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

	public long getRequiredClearTopDepTenantId() {
		return( getClearSubDep1Buff().getRequiredClearTopDepTenantId() );
	}

	public long getRequiredClearTopDepId() {
		return( getClearSubDep1Buff().getRequiredClearTopDepId() );
	}

	public String getRequiredName() {
		return( getClearSubDep1Buff().getRequiredName() );
	}

	public ICFBamClearTopDepObj getRequiredContainerClearTopDep() {
		return( getRequiredContainerClearTopDep( false ) );
	}

	public ICFBamClearTopDepObj getRequiredContainerClearTopDep( boolean forceRead ) {
		if( ( requiredContainerClearTopDep == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerClearTopDep = ((ICFBamSchemaObj)schema).getClearTopDepTableObj().readClearTopDepByIdIdx( getClearSubDep1Buff().getRequiredClearTopDepTenantId(),
					getClearSubDep1Buff().getRequiredClearTopDepId(), forceRead );
			}
		}
		return( requiredContainerClearTopDep );
	}

	public List<ICFBamClearSubDep2Obj> getOptionalComponentsClearDep() {
		List<ICFBamClearSubDep2Obj> retval;
		retval = ((ICFBamSchemaObj)schema).getClearSubDep2TableObj().readClearSubDep2ByClearSubDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamClearSubDep2Obj> getOptionalComponentsClearDep( boolean forceRead ) {
		List<ICFBamClearSubDep2Obj> retval;
		retval = ((ICFBamSchemaObj)schema).getClearSubDep2TableObj().readClearSubDep2ByClearSubDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}
}
