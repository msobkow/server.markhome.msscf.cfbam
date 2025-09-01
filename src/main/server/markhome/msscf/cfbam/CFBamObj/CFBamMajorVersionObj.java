// Description: Java 11 base object instance implementation for CFBam MajorVersion.

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

public class CFBamMajorVersionObj
	implements ICFBamMajorVersionObj
{
	public final static String CLASS_CODE = "a102";
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ICFIntMajorVersionEditObj edit;
	protected ICFIntSchemaObj schema;
	protected CFIntMajorVersionPKey pKey;
	protected CFIntMajorVersionBuff buff;
	protected ICFSecTenantObj requiredOwnerTenant;
	protected ICFIntSubProjectObj requiredContainerParentSPrj;

	public CFBamMajorVersionObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerParentSPrj = null;
	}

	public CFBamMajorVersionObj( ICFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
		requiredContainerParentSPrj = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "MajorVersion" );
	}

	public ICFLibAnyObj getScope() {
		ICFIntSubProjectObj scope = getRequiredContainerParentSPrj();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFIntSubProjectObj scope = getRequiredContainerParentSPrj();
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
			subObj = ((ICFBamSchemaObj)getSchema()).getMinorVersionTableObj().readMinorVersionByNameIdx( getRequiredTenantId(),
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

	public ICFIntMajorVersionObj realise() {
		ICFIntMajorVersionObj retobj = ((ICFBamSchemaObj)schema).getMajorVersionTableObj().realiseMajorVersion(
			(ICFIntMajorVersionObj)this );
		return( (ICFIntMajorVersionObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getMajorVersionTableObj().reallyDeepDisposeMajorVersion( (ICFIntMajorVersionObj)this );
	}

	public ICFIntMajorVersionObj read() {
		ICFIntMajorVersionObj retobj = ((ICFBamSchemaObj)schema).getMajorVersionTableObj().readMajorVersionByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFIntMajorVersionObj)retobj );
	}

	public ICFIntMajorVersionObj read( boolean forceRead ) {
		ICFIntMajorVersionObj retobj = ((ICFBamSchemaObj)schema).getMajorVersionTableObj().readMajorVersionByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFIntMajorVersionObj)retobj );
	}

	public ICFIntMajorVersionTableObj getMajorVersionTable() {
		return( ((ICFBamSchemaObj)schema).getMajorVersionTableObj() );
	}

	public ICFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFIntSchemaObj value ) {
		schema = value;
	}

	public CFIntMajorVersionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableMajorVersion().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFIntMajorVersionBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFIntMajorVersionBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFIntMajorVersionBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerParentSPrj = null;
	}

	public CFIntMajorVersionBuff getMajorVersionBuff() {
		return( (CFIntMajorVersionBuff)getBuff() );
	}

	public CFIntMajorVersionPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFBamSchema)schema.getBackingStore()).getFactoryMajorVersion().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFIntMajorVersionPKey value ) {
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

	public ICFIntMajorVersionEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFIntMajorVersionObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFIntMajorVersionObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getMajorVersionTableObj().lockMajorVersion( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getMajorVersionTableObj().newEditInstance( lockobj );
		return( (ICFIntMajorVersionEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFIntMajorVersionEditObj getEdit() {
		return( edit );
	}

	public ICFIntMajorVersionEditObj getEditAsMajorVersion() {
		return( (ICFIntMajorVersionEditObj)edit );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFIntMajorVersionBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFIntMajorVersionBuff buff = getBuff();
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

	public long getRequiredSubProjectId() {
		return( getMajorVersionBuff().getRequiredSubProjectId() );
	}

	public String getRequiredName() {
		return( getMajorVersionBuff().getRequiredName() );
	}

	public String getOptionalDescription() {
		return( getMajorVersionBuff().getOptionalDescription() );
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

	public ICFIntSubProjectObj getRequiredContainerParentSPrj() {
		return( getRequiredContainerParentSPrj( false ) );
	}

	public ICFIntSubProjectObj getRequiredContainerParentSPrj( boolean forceRead ) {
		if( ( requiredContainerParentSPrj == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerParentSPrj = ((ICFBamSchemaObj)schema).getSubProjectTableObj().readSubProjectByIdIdx( getPKey().getRequiredTenantId(),
					getMajorVersionBuff().getRequiredSubProjectId(), forceRead );
			}
		}
		return( requiredContainerParentSPrj );
	}

	public List<ICFIntMinorVersionObj> getOptionalComponentsMinorVer() {
		List<ICFIntMinorVersionObj> retval;
		retval = ((ICFBamSchemaObj)schema).getMinorVersionTableObj().readMinorVersionByMajorVerIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFIntMinorVersionObj> getOptionalComponentsMinorVer( boolean forceRead ) {
		List<ICFIntMinorVersionObj> retval;
		retval = ((ICFBamSchemaObj)schema).getMinorVersionTableObj().readMinorVersionByMajorVerIdx( getPKey().getRequiredTenantId(),
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
