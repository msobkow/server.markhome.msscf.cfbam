// Description: Java 11 edit object instance implementation for CFBam SubProject.

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

public class CFBamSubProjectEditObj
	implements ICFBamSubProjectEditObj
{
	protected ICFIntSubProjectObj orig;
	protected CFIntSubProjectBuff buff;
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected ICFSecTenantObj requiredOwnerTenant;
	protected ICFIntTopProjectObj requiredContainerParentTPrj;

	public CFBamSubProjectEditObj( ICFIntSubProjectObj argOrig ) {
		orig = argOrig;
		getBuff();
		CFIntSubProjectBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerParentTPrj = null;
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFIntSubProjectBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFIntSubProjectBuff buff = getBuff();
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
		return( CFBamSubProjectObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SubProject" );
	}

	public ICFLibAnyObj getScope() {
		ICFIntTopProjectObj scope = getRequiredContainerParentTPrj();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFIntTopProjectObj scope = getRequiredContainerParentTPrj();
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
			subObj = ((ICFBamSchemaObj)getSchema()).getMajorVersionTableObj().readMajorVersionByNameIdx( getRequiredTenantId(),
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

	public ICFIntSubProjectObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFIntSubProjectObj retobj = getSchema().getSubProjectTableObj().realiseSubProject( (ICFBamSubProjectObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSubProject().forget();
	}

	public ICFIntSubProjectObj read() {
		ICFIntSubProjectObj retval = getOrigAsSubProject().read();
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFIntSubProjectObj read( boolean forceRead ) {
		ICFIntSubProjectObj retval = getOrigAsSubProject().read( forceRead );
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFIntSubProjectObj create() {
		copyBuffToOrig();
		ICFIntSubProjectObj retobj = ((ICFBamSchemaObj)getOrigAsSubProject().getSchema()).getSubProjectTableObj().createSubProject( getOrigAsSubProject() );
		if( retobj == getOrigAsSubProject() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFIntSubProjectEditObj update() {
		getSchema().getSubProjectTableObj().updateSubProject( (ICFIntSubProjectObj)this );
		return( null );
	}

	public CFIntSubProjectEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSubProjectTableObj().deleteSubProject( getOrigAsSubProject() );
		return( null );
	}

	public ICFIntSubProjectTableObj getSubProjectTable() {
		return( orig.getSchema().getSubProjectTableObj() );
	}

	public ICFIntSubProjectEditObj getEdit() {
		return( (ICFIntSubProjectEditObj)this );
	}

	public ICFIntSubProjectEditObj getEditAsSubProject() {
		return( (ICFIntSubProjectEditObj)this );
	}

	public ICFIntSubProjectEditObj beginEdit() {
		throw new CFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public ICFIntSubProjectObj getOrig() {
		return( orig );
	}

	public ICFIntSubProjectObj getOrigAsSubProject() {
		return( (ICFIntSubProjectObj)orig );
	}

	public ICFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public CFIntSubProjectBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsSubProject().getSchema().getBackingStore()).getFactorySubProject().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFIntSubProjectBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerParentTPrj = null;
		}
	}

	public CFIntSubProjectBuff getSubProjectBuff() {
		return( (CFIntSubProjectBuff)getBuff() );
	}

	public CFIntSubProjectPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( CFIntSubProjectPKey value ) {
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

	public long getRequiredTopProjectId() {
		return( getSubProjectBuff().getRequiredTopProjectId() );
	}

	public String getRequiredName() {
		return( getSubProjectBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getSubProjectBuff().getRequiredName() != value ) {
			getSubProjectBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getSubProjectBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getSubProjectBuff().getOptionalDescription() != value ) {
			getSubProjectBuff().setOptionalDescription( value );
		}
	}

	public ICFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFSecTenantObj obj = ((ICFBamSchemaObj)getOrigAsSubProject().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( ICFSecTenantObj value ) {
			if( buff == null ) {
				getSubProjectBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getSubProjectBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public ICFIntTopProjectObj getRequiredContainerParentTPrj() {
		return( getRequiredContainerParentTPrj( false ) );
	}

	public ICFIntTopProjectObj getRequiredContainerParentTPrj( boolean forceRead ) {
		if( forceRead || ( requiredContainerParentTPrj == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFIntTopProjectObj obj = ((ICFBamSchemaObj)getOrigAsSubProject().getSchema()).getTopProjectTableObj().readTopProjectByIdIdx( getPKey().getRequiredTenantId(),
					getSubProjectBuff().getRequiredTopProjectId() );
				requiredContainerParentTPrj = obj;
				if( obj != null ) {
					getSubProjectBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getSubProjectBuff().setRequiredTopProjectId( obj.getRequiredId() );
					requiredContainerParentTPrj = obj;
				}
			}
		}
		return( requiredContainerParentTPrj );
	}

	public void setRequiredContainerParentTPrj( ICFIntTopProjectObj value ) {
			if( buff == null ) {
				getSubProjectBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getSubProjectBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getSubProjectBuff().setRequiredTopProjectId( value.getRequiredId() );
			}
			requiredContainerParentTPrj = value;
	}

	public List<ICFIntMajorVersionObj> getOptionalComponentsMajorVer() {
		List<ICFIntMajorVersionObj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsSubProject().getSchema()).getMajorVersionTableObj().readMajorVersionBySubProjectIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFIntMajorVersionObj> getOptionalComponentsMajorVer( boolean forceRead ) {
		List<ICFIntMajorVersionObj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsSubProject().getSchema()).getMajorVersionTableObj().readMajorVersionBySubProjectIdx( getPKey().getRequiredTenantId(),
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
		CFIntSubProjectBuff origBuff = getOrigAsSubProject().getSubProjectBuff();
		CFIntSubProjectBuff myBuff = getSubProjectBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFIntSubProjectBuff origBuff = getOrigAsSubProject().getSubProjectBuff();
		CFIntSubProjectBuff myBuff = getSubProjectBuff();
		myBuff.set( origBuff );
	}
}
