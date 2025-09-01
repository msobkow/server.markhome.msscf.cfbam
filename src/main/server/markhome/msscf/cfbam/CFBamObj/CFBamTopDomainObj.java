// Description: Java 11 base object instance implementation for CFBam TopDomain.

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

public class CFBamTopDomainObj
	implements ICFBamTopDomainObj
{
	public final static String CLASS_CODE = "a107";
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ICFIntTopDomainEditObj edit;
	protected ICFIntSchemaObj schema;
	protected CFIntTopDomainPKey pKey;
	protected CFIntTopDomainBuff buff;
	protected ICFSecTenantObj requiredOwnerTenant;
	protected ICFIntTldObj requiredContainerParentTld;

	public CFBamTopDomainObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerParentTld = null;
	}

	public CFBamTopDomainObj( ICFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
		requiredContainerParentTld = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TopDomain" );
	}

	public ICFLibAnyObj getScope() {
		ICFIntTldObj scope = getRequiredContainerParentTld();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFIntTldObj scope = getRequiredContainerParentTld();
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

	public ICFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		ICFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		ICFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
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
		if( subObj == null ) {
			subObj = ((ICFBamSchemaObj)getSchema()).getTopProjectTableObj().readTopProjectByNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
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
			else if( container instanceof ICFIntTenantObj ) {
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

	public String getObjFullName() {
		String fullName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				fullName = containerName + "." + fullName;
				container = container.getObjScope();
			}
		}
		return( fullName );
	}

	public ICFIntTopDomainObj realise() {
		ICFIntTopDomainObj retobj = ((ICFBamSchemaObj)schema).getTopDomainTableObj().realiseTopDomain(
			(ICFIntTopDomainObj)this );
		return( (ICFIntTopDomainObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getTopDomainTableObj().reallyDeepDisposeTopDomain( (ICFIntTopDomainObj)this );
	}

	public ICFIntTopDomainObj read() {
		ICFIntTopDomainObj retobj = ((ICFBamSchemaObj)schema).getTopDomainTableObj().readTopDomainByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFIntTopDomainObj)retobj );
	}

	public ICFIntTopDomainObj read( boolean forceRead ) {
		ICFIntTopDomainObj retobj = ((ICFBamSchemaObj)schema).getTopDomainTableObj().readTopDomainByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFIntTopDomainObj)retobj );
	}

	public ICFIntTopDomainTableObj getTopDomainTable() {
		return( ((ICFBamSchemaObj)schema).getTopDomainTableObj() );
	}

	public ICFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFIntSchemaObj value ) {
		schema = value;
	}

	public CFIntTopDomainBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopDomain().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableTopDomain().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFIntTopDomainBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFIntTopDomainBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFIntTopDomainBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerParentTld = null;
	}

	public CFIntTopDomainBuff getTopDomainBuff() {
		return( (CFIntTopDomainBuff)getBuff() );
	}

	public CFIntTopDomainPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTopDomain().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFIntTopDomainPKey value ) {
		if( pKey != value ) {
			pKey = value;
			copyPKeyToBuff();
		}
	}

	public boolean getIsNew() {
		return( isNew );
	}

	public void setIsNew( boolean value ) {
		isNew = value;
	}

	public ICFIntTopDomainEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFIntTopDomainObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFIntTopDomainObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getTopDomainTableObj().lockTopDomain( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getTopDomainTableObj().newEditInstance( lockobj );
		return( (ICFIntTopDomainEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFIntTopDomainEditObj getEdit() {
		return( edit );
	}

	public ICFIntTopDomainEditObj getEditAsTopDomain() {
		return( (ICFIntTopDomainEditObj)edit );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFIntTopDomainBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFIntTopDomainBuff buff = getBuff();
			updatedBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public long getRequiredTldId() {
		return( getTopDomainBuff().getRequiredTldId() );
	}

	public String getRequiredName() {
		return( getTopDomainBuff().getRequiredName() );
	}

	public String getOptionalDescription() {
		return( getTopDomainBuff().getOptionalDescription() );
	}

	public ICFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( ( requiredOwnerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerTenant = ((ICFBamSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredOwnerTenant );
	}

	public ICFIntTldObj getRequiredContainerParentTld() {
		return( getRequiredContainerParentTld( false ) );
	}

	public ICFIntTldObj getRequiredContainerParentTld( boolean forceRead ) {
		if( ( requiredContainerParentTld == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerParentTld = ((ICFBamSchemaObj)schema).getTldTableObj().readTldByIdIdx( getPKey().getRequiredTenantId(),
					getTopDomainBuff().getRequiredTldId(), forceRead );
			}
		}
		return( requiredContainerParentTld );
	}

	public List<ICFIntTopProjectObj> getOptionalComponentsTopProject() {
		List<ICFIntTopProjectObj> retval;
		retval = ((ICFBamSchemaObj)schema).getTopProjectTableObj().readTopProjectByTopDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFIntTopProjectObj> getOptionalComponentsTopProject( boolean forceRead ) {
		List<ICFIntTopProjectObj> retval;
		retval = ((ICFBamSchemaObj)schema).getTopProjectTableObj().readTopProjectByTopDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}
