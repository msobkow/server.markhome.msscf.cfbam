// Description: Java 11 base object instance implementation for CFBam ServerObjFunc.

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

public class CFBamServerObjFuncObj
	extends CFBamServerMethodObj
	implements ICFBamServerObjFuncObj
{
	public final static String CLASS_CODE = "a806";
	protected ICFBamTableObj optionalLookupRetTable;

	public CFBamServerObjFuncObj() {
		super();
		optionalLookupRetTable = null;
	}

	public CFBamServerObjFuncObj( ICFBamSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupRetTable = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ServerObjFunc" );
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

	public ICFBamScopeObj realise() {
		ICFBamServerObjFuncObj retobj = ((ICFBamSchemaObj)schema).getServerObjFuncTableObj().realiseServerObjFunc(
			(ICFBamServerObjFuncObj)this );
		return( (ICFBamScopeObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getServerObjFuncTableObj().reallyDeepDisposeServerObjFunc( (ICFBamServerObjFuncObj)this );
	}

	public ICFBamScopeObj read() {
		ICFBamServerObjFuncObj retobj = ((ICFBamSchemaObj)schema).getServerObjFuncTableObj().readServerObjFuncByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamScopeObj read( boolean forceRead ) {
		ICFBamServerObjFuncObj retobj = ((ICFBamSchemaObj)schema).getServerObjFuncTableObj().readServerObjFuncByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamServerObjFuncTableObj getServerObjFuncTable() {
		return( ((ICFBamSchemaObj)schema).getServerObjFuncTableObj() );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof CFBamServerObjFuncBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFBamServerObjFuncBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		requiredContainerForTable = null;
		optionalLookupRetTable = null;
	}

	public CFBamServerObjFuncBuff getServerObjFuncBuff() {
		return( (CFBamServerObjFuncBuff)getBuff() );
	}

	public ICFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFBamServerObjFuncObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFBamServerObjFuncObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getServerObjFuncTableObj().lockServerObjFunc( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getServerObjFuncTableObj().newEditInstance( lockobj );
		return( (ICFBamScopeEditObj)edit );
	}

	public ICFBamServerObjFuncEditObj getEditAsServerObjFunc() {
		return( (ICFBamServerObjFuncEditObj)edit );
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

	public Long getOptionalRetTenantId() {
		return( getServerObjFuncBuff().getOptionalRetTenantId() );
	}

	public Long getOptionalRetTableId() {
		return( getServerObjFuncBuff().getOptionalRetTableId() );
	}

	public ICFBamTableObj getOptionalLookupRetTable() {
		return( getOptionalLookupRetTable( false ) );
	}

	public ICFBamTableObj getOptionalLookupRetTable( boolean forceRead ) {
		if( ( optionalLookupRetTable == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getServerObjFuncBuff().getOptionalRetTenantId() == null ) {
				anyMissing = true;
			}
			if( getServerObjFuncBuff().getOptionalRetTableId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupRetTable = ((ICFBamSchemaObj)schema).getTableTableObj().readTableByIdIdx( getServerObjFuncBuff().getOptionalRetTenantId(),
					getServerObjFuncBuff().getOptionalRetTableId(), forceRead );
			}
		}
		return( optionalLookupRetTable );
	}
}
