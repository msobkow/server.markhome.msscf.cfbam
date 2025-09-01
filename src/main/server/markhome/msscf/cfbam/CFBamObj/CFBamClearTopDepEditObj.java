// Description: Java 11 edit object instance implementation for CFBam ClearTopDep.

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

public class CFBamClearTopDepEditObj
	extends CFBamClearDepEditObj

	implements ICFBamClearTopDepEditObj
{
	protected ICFBamTableObj requiredContainerTable;
	protected ICFBamClearTopDepObj optionalLookupPrev;
	protected ICFBamClearTopDepObj optionalLookupNext;

	public CFBamClearTopDepEditObj( ICFBamClearTopDepObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public String getClassCode() {
		return( CFBamClearTopDepObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearTopDep" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamTableObj scope = getRequiredContainerTable();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamTableObj scope = getRequiredContainerTable();
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
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamClearTopDepObj retobj = getSchema().getClearTopDepTableObj().realiseClearTopDep( (ICFBamClearTopDepObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsClearTopDep().forget();
	}

	public ICFBamClearTopDepObj moveUp() {
		throw new CFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamClearTopDepObj moveDown() {
		throw new CFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamClearTopDepObj retobj = ((ICFBamSchemaObj)getOrigAsClearTopDep().getSchema()).getClearTopDepTableObj().createClearTopDep( getOrigAsClearTopDep() );
		if( retobj == getOrigAsClearTopDep() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getClearTopDepTableObj().updateClearTopDep( (ICFBamClearTopDepObj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getClearTopDepTableObj().deleteClearTopDep( getOrigAsClearTopDep() );
		return( null );
	}

	public ICFBamClearTopDepTableObj getClearTopDepTable() {
		return( orig.getSchema().getClearTopDepTableObj() );
	}

	public ICFBamClearTopDepEditObj getEditAsClearTopDep() {
		return( (ICFBamClearTopDepEditObj)this );
	}

	public ICFBamClearTopDepObj getOrigAsClearTopDep() {
		return( (ICFBamClearTopDepObj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsClearTopDep().getSchema().getBackingStore()).getFactoryClearTopDep().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerTable = null;
			optionalLookupPrev = null;
			optionalLookupNext = null;
		}
	}

	public CFBamClearTopDepBuff getClearTopDepBuff() {
		return( (CFBamClearTopDepBuff)getBuff() );
	}

	public long getRequiredTableTenantId() {
		return( getClearTopDepBuff().getRequiredTableTenantId() );
	}

	public long getRequiredTableId() {
		return( getClearTopDepBuff().getRequiredTableId() );
	}

	public String getRequiredName() {
		return( getClearTopDepBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getClearTopDepBuff().getRequiredName() != value ) {
			getClearTopDepBuff().setRequiredName( value );
		}
	}

	public Long getOptionalPrevTenantId() {
		return( getClearTopDepBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getClearTopDepBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getClearTopDepBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getClearTopDepBuff().getOptionalNextId() );
	}

	public ICFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public ICFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsClearTopDep().getSchema()).getTableTableObj().readTableByIdIdx( getClearTopDepBuff().getRequiredTableTenantId(),
					getClearTopDepBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getClearTopDepBuff().setRequiredTableTenantId( obj.getRequiredTenantId() );
					getClearTopDepBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( ICFBamTableObj value ) {
			if( buff == null ) {
				getClearTopDepBuff();
			}
			if( value != null ) {
				getClearTopDepBuff().setRequiredTableTenantId( value.getRequiredTenantId() );
				getClearTopDepBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
	}

	public List<ICFBamClearSubDep1Obj> getOptionalComponentsClearDep() {
		List<ICFBamClearSubDep1Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsClearTopDep().getSchema()).getClearSubDep1TableObj().readClearSubDep1ByClearTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamClearSubDep1Obj> getOptionalComponentsClearDep( boolean forceRead ) {
		List<ICFBamClearSubDep1Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsClearTopDep().getSchema()).getClearSubDep1TableObj().readClearSubDep1ByClearTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public ICFBamClearTopDepObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public ICFBamClearTopDepObj getOptionalLookupPrev( boolean forceRead ) {
		if( forceRead || ( optionalLookupPrev == null ) ) {
			boolean anyMissing = false;
			if( getClearTopDepBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getClearTopDepBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamClearTopDepObj obj = ((ICFBamSchemaObj)getOrigAsClearTopDep().getSchema()).getClearTopDepTableObj().readClearTopDepByIdIdx( getClearTopDepBuff().getOptionalPrevTenantId(),
					getClearTopDepBuff().getOptionalPrevId() );
				optionalLookupPrev = obj;
			}
		}
		return( optionalLookupPrev );
	}

	public void setOptionalLookupPrev( ICFBamClearTopDepObj value ) {
			if( buff == null ) {
				getClearTopDepBuff();
			}
			if( value != null ) {
				getClearTopDepBuff().setOptionalPrevTenantId( value.getRequiredTenantId() );
				getClearTopDepBuff().setOptionalPrevId( value.getRequiredId() );
			}
			else {
				getClearTopDepBuff().setOptionalPrevTenantId( null );
				getClearTopDepBuff().setOptionalPrevId( null );
			}
			optionalLookupPrev = value;
	}

	public ICFBamClearTopDepObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public ICFBamClearTopDepObj getOptionalLookupNext( boolean forceRead ) {
		if( forceRead || ( optionalLookupNext == null ) ) {
			boolean anyMissing = false;
			if( getClearTopDepBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getClearTopDepBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamClearTopDepObj obj = ((ICFBamSchemaObj)getOrigAsClearTopDep().getSchema()).getClearTopDepTableObj().readClearTopDepByIdIdx( getClearTopDepBuff().getOptionalNextTenantId(),
					getClearTopDepBuff().getOptionalNextId() );
				optionalLookupNext = obj;
			}
		}
		return( optionalLookupNext );
	}

	public void setOptionalLookupNext( ICFBamClearTopDepObj value ) {
			if( buff == null ) {
				getClearTopDepBuff();
			}
			if( value != null ) {
				getClearTopDepBuff().setOptionalNextTenantId( value.getRequiredTenantId() );
				getClearTopDepBuff().setOptionalNextId( value.getRequiredId() );
			}
			else {
				getClearTopDepBuff().setOptionalNextTenantId( null );
				getClearTopDepBuff().setOptionalNextId( null );
			}
			optionalLookupNext = value;
	}

	public void copyBuffToOrig() {
		CFBamClearTopDepBuff origBuff = getOrigAsClearTopDep().getClearTopDepBuff();
		CFBamClearTopDepBuff myBuff = getClearTopDepBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamClearTopDepBuff origBuff = getOrigAsClearTopDep().getClearTopDepBuff();
		CFBamClearTopDepBuff myBuff = getClearTopDepBuff();
		myBuff.set( origBuff );
	}
}
