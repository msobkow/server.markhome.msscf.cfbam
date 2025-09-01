// Description: Java 11 edit object instance implementation for CFBam MajorVersion.

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

public class CFBamMajorVersionEditObj
	implements ICFBamMajorVersionEditObj
{
	protected ICFIntMajorVersionObj orig;
	protected CFIntMajorVersionBuff buff;
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected ICFSecTenantObj requiredOwnerTenant;
	protected ICFIntSubProjectObj requiredContainerParentSPrj;

	public CFBamMajorVersionEditObj( ICFIntMajorVersionObj argOrig ) {
		orig = argOrig;
		getBuff();
		CFIntMajorVersionBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerParentSPrj = null;
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

	public void setCreatedBy( ICFSecSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getBuff().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setCreatedAt( Calendar value ) {
		getBuff().setCreatedAt( value );
	}

	public void setUpdatedBy( ICFSecSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getBuff().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setUpdatedAt( Calendar value ) {
		getBuff().setUpdatedAt( value );
	}

	public String getClassCode() {
		return( CFBamMajorVersionObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		ICFIntMajorVersionObj retobj = getSchema().getMajorVersionTableObj().realiseMajorVersion( (ICFBamMajorVersionObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsMajorVersion().forget();
	}

	public ICFIntMajorVersionObj read() {
		ICFIntMajorVersionObj retval = getOrigAsMajorVersion().read();
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFIntMajorVersionObj read( boolean forceRead ) {
		ICFIntMajorVersionObj retval = getOrigAsMajorVersion().read( forceRead );
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFIntMajorVersionObj create() {
		copyBuffToOrig();
		ICFIntMajorVersionObj retobj = ((ICFBamSchemaObj)getOrigAsMajorVersion().getSchema()).getMajorVersionTableObj().createMajorVersion( getOrigAsMajorVersion() );
		if( retobj == getOrigAsMajorVersion() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFIntMajorVersionEditObj update() {
		getSchema().getMajorVersionTableObj().updateMajorVersion( (ICFIntMajorVersionObj)this );
		return( null );
	}

	public CFIntMajorVersionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getMajorVersionTableObj().deleteMajorVersion( getOrigAsMajorVersion() );
		return( null );
	}

	public ICFIntMajorVersionTableObj getMajorVersionTable() {
		return( orig.getSchema().getMajorVersionTableObj() );
	}

	public ICFIntMajorVersionEditObj getEdit() {
		return( (ICFIntMajorVersionEditObj)this );
	}

	public ICFIntMajorVersionEditObj getEditAsMajorVersion() {
		return( (ICFIntMajorVersionEditObj)this );
	}

	public ICFIntMajorVersionEditObj beginEdit() {
		throw new CFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public ICFIntMajorVersionObj getOrig() {
		return( orig );
	}

	public ICFIntMajorVersionObj getOrigAsMajorVersion() {
		return( (ICFIntMajorVersionObj)orig );
	}

	public ICFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public CFIntMajorVersionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsMajorVersion().getSchema().getBackingStore()).getFactoryMajorVersion().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFIntMajorVersionBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerParentSPrj = null;
		}
	}

	public CFIntMajorVersionBuff getMajorVersionBuff() {
		return( (CFIntMajorVersionBuff)getBuff() );
	}

	public CFIntMajorVersionPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( CFIntMajorVersionPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
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

	public void setRequiredName( String value ) {
		if( getMajorVersionBuff().getRequiredName() != value ) {
			getMajorVersionBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getMajorVersionBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getMajorVersionBuff().getOptionalDescription() != value ) {
			getMajorVersionBuff().setOptionalDescription( value );
		}
	}

	public ICFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFSecTenantObj obj = ((ICFBamSchemaObj)getOrigAsMajorVersion().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( ICFSecTenantObj value ) {
			if( buff == null ) {
				getMajorVersionBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getMajorVersionBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public ICFIntSubProjectObj getRequiredContainerParentSPrj() {
		return( getRequiredContainerParentSPrj( false ) );
	}

	public ICFIntSubProjectObj getRequiredContainerParentSPrj( boolean forceRead ) {
		if( forceRead || ( requiredContainerParentSPrj == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFIntSubProjectObj obj = ((ICFBamSchemaObj)getOrigAsMajorVersion().getSchema()).getSubProjectTableObj().readSubProjectByIdIdx( getPKey().getRequiredTenantId(),
					getMajorVersionBuff().getRequiredSubProjectId() );
				requiredContainerParentSPrj = obj;
				if( obj != null ) {
					getMajorVersionBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getMajorVersionBuff().setRequiredSubProjectId( obj.getRequiredId() );
					requiredContainerParentSPrj = obj;
				}
			}
		}
		return( requiredContainerParentSPrj );
	}

	public void setRequiredContainerParentSPrj( ICFIntSubProjectObj value ) {
			if( buff == null ) {
				getMajorVersionBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getMajorVersionBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getMajorVersionBuff().setRequiredSubProjectId( value.getRequiredId() );
			}
			requiredContainerParentSPrj = value;
	}

	public List<ICFIntMinorVersionObj> getOptionalComponentsMinorVer() {
		List<ICFIntMinorVersionObj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsMajorVersion().getSchema()).getMinorVersionTableObj().readMinorVersionByMajorVerIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFIntMinorVersionObj> getOptionalComponentsMinorVer( boolean forceRead ) {
		List<ICFIntMinorVersionObj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsMajorVersion().getSchema()).getMinorVersionTableObj().readMinorVersionByMajorVerIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		CFIntMajorVersionBuff origBuff = getOrigAsMajorVersion().getMajorVersionBuff();
		CFIntMajorVersionBuff myBuff = getMajorVersionBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFIntMajorVersionBuff origBuff = getOrigAsMajorVersion().getMajorVersionBuff();
		CFIntMajorVersionBuff myBuff = getMajorVersionBuff();
		myBuff.set( origBuff );
	}
}
