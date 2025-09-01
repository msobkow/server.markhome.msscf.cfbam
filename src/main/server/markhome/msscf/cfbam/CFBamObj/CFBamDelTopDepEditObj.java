// Description: Java 11 edit object instance implementation for CFBam DelTopDep.

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

public class CFBamDelTopDepEditObj
	extends CFBamDelDepEditObj

	implements ICFBamDelTopDepEditObj
{
	protected ICFBamTableObj requiredContainerTable;
	protected ICFBamDelTopDepObj optionalLookupPrev;
	protected ICFBamDelTopDepObj optionalLookupNext;

	public CFBamDelTopDepEditObj( ICFBamDelTopDepObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public String getClassCode() {
		return( CFBamDelTopDepObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelTopDep" );
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
		ICFBamDelTopDepObj retobj = getSchema().getDelTopDepTableObj().realiseDelTopDep( (ICFBamDelTopDepObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDelTopDep().forget();
	}

	public ICFBamDelTopDepObj moveUp() {
		throw new CFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamDelTopDepObj moveDown() {
		throw new CFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamDelTopDepObj retobj = ((ICFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelTopDepTableObj().createDelTopDep( getOrigAsDelTopDep() );
		if( retobj == getOrigAsDelTopDep() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getDelTopDepTableObj().updateDelTopDep( (ICFBamDelTopDepObj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDelTopDepTableObj().deleteDelTopDep( getOrigAsDelTopDep() );
		return( null );
	}

	public ICFBamDelTopDepTableObj getDelTopDepTable() {
		return( orig.getSchema().getDelTopDepTableObj() );
	}

	public ICFBamDelTopDepEditObj getEditAsDelTopDep() {
		return( (ICFBamDelTopDepEditObj)this );
	}

	public ICFBamDelTopDepObj getOrigAsDelTopDep() {
		return( (ICFBamDelTopDepObj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDelTopDep().getSchema().getBackingStore()).getFactoryDelTopDep().newBuff();
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

	public CFBamDelTopDepBuff getDelTopDepBuff() {
		return( (CFBamDelTopDepBuff)getBuff() );
	}

	public String getRequiredName() {
		return( getDelTopDepBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getDelTopDepBuff().getRequiredName() != value ) {
			getDelTopDepBuff().setRequiredName( value );
		}
	}

	public long getRequiredTableTenantId() {
		return( getDelTopDepBuff().getRequiredTableTenantId() );
	}

	public long getRequiredTableId() {
		return( getDelTopDepBuff().getRequiredTableId() );
	}

	public Long getOptionalPrevTenantId() {
		return( getDelTopDepBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getDelTopDepBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getDelTopDepBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getDelTopDepBuff().getOptionalNextId() );
	}

	public ICFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public ICFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getTableTableObj().readTableByIdIdx( getDelTopDepBuff().getRequiredTableTenantId(),
					getDelTopDepBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getDelTopDepBuff().setRequiredTableTenantId( obj.getRequiredTenantId() );
					getDelTopDepBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( ICFBamTableObj value ) {
			if( buff == null ) {
				getDelTopDepBuff();
			}
			if( value != null ) {
				getDelTopDepBuff().setRequiredTableTenantId( value.getRequiredTenantId() );
				getDelTopDepBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
	}

	public List<ICFBamDelSubDep1Obj> getOptionalComponentsDelDep() {
		List<ICFBamDelSubDep1Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelSubDep1TableObj().readDelSubDep1ByDelTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamDelSubDep1Obj> getOptionalComponentsDelDep( boolean forceRead ) {
		List<ICFBamDelSubDep1Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelSubDep1TableObj().readDelSubDep1ByDelTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public ICFBamDelTopDepObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public ICFBamDelTopDepObj getOptionalLookupPrev( boolean forceRead ) {
		if( forceRead || ( optionalLookupPrev == null ) ) {
			boolean anyMissing = false;
			if( getDelTopDepBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getDelTopDepBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamDelTopDepObj obj = ((ICFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelTopDepTableObj().readDelTopDepByIdIdx( getDelTopDepBuff().getOptionalPrevTenantId(),
					getDelTopDepBuff().getOptionalPrevId() );
				optionalLookupPrev = obj;
			}
		}
		return( optionalLookupPrev );
	}

	public void setOptionalLookupPrev( ICFBamDelTopDepObj value ) {
			if( buff == null ) {
				getDelTopDepBuff();
			}
			if( value != null ) {
				getDelTopDepBuff().setOptionalPrevTenantId( value.getRequiredTenantId() );
				getDelTopDepBuff().setOptionalPrevId( value.getRequiredId() );
			}
			else {
				getDelTopDepBuff().setOptionalPrevTenantId( null );
				getDelTopDepBuff().setOptionalPrevId( null );
			}
			optionalLookupPrev = value;
	}

	public ICFBamDelTopDepObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public ICFBamDelTopDepObj getOptionalLookupNext( boolean forceRead ) {
		if( forceRead || ( optionalLookupNext == null ) ) {
			boolean anyMissing = false;
			if( getDelTopDepBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getDelTopDepBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamDelTopDepObj obj = ((ICFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelTopDepTableObj().readDelTopDepByIdIdx( getDelTopDepBuff().getOptionalNextTenantId(),
					getDelTopDepBuff().getOptionalNextId() );
				optionalLookupNext = obj;
			}
		}
		return( optionalLookupNext );
	}

	public void setOptionalLookupNext( ICFBamDelTopDepObj value ) {
			if( buff == null ) {
				getDelTopDepBuff();
			}
			if( value != null ) {
				getDelTopDepBuff().setOptionalNextTenantId( value.getRequiredTenantId() );
				getDelTopDepBuff().setOptionalNextId( value.getRequiredId() );
			}
			else {
				getDelTopDepBuff().setOptionalNextTenantId( null );
				getDelTopDepBuff().setOptionalNextId( null );
			}
			optionalLookupNext = value;
	}

	public void copyBuffToOrig() {
		CFBamDelTopDepBuff origBuff = getOrigAsDelTopDep().getDelTopDepBuff();
		CFBamDelTopDepBuff myBuff = getDelTopDepBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDelTopDepBuff origBuff = getOrigAsDelTopDep().getDelTopDepBuff();
		CFBamDelTopDepBuff myBuff = getDelTopDepBuff();
		myBuff.set( origBuff );
	}
}
