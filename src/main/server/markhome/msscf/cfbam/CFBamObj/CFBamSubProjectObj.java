// Description: Java 11 base object instance implementation for CFBam SubProject.

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

public class CFBamSubProjectObj
	implements ICFBamSubProjectObj
{
	public final static String CLASS_CODE = "a105";
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ICFIntSubProjectEditObj edit;
	protected ICFIntSchemaObj schema;
	protected CFIntSubProjectPKey pKey;
	protected CFIntSubProjectBuff buff;
	protected ICFSecTenantObj requiredOwnerTenant;
	protected ICFIntTopProjectObj requiredContainerParentTPrj;

	public CFBamSubProjectObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerParentTPrj = null;
	}

	public CFBamSubProjectObj( ICFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
		requiredContainerParentTPrj = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		ICFIntSubProjectObj retobj = ((ICFBamSchemaObj)schema).getSubProjectTableObj().realiseSubProject(
			(ICFIntSubProjectObj)this );
		return( (ICFIntSubProjectObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getSubProjectTableObj().reallyDeepDisposeSubProject( (ICFIntSubProjectObj)this );
	}

	public ICFIntSubProjectObj read() {
		ICFIntSubProjectObj retobj = ((ICFBamSchemaObj)schema).getSubProjectTableObj().readSubProjectByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFIntSubProjectObj)retobj );
	}

	public ICFIntSubProjectObj read( boolean forceRead ) {
		ICFIntSubProjectObj retobj = ((ICFBamSchemaObj)schema).getSubProjectTableObj().readSubProjectByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFIntSubProjectObj)retobj );
	}

	public ICFIntSubProjectTableObj getSubProjectTable() {
		return( ((ICFBamSchemaObj)schema).getSubProjectTableObj() );
	}

	public ICFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFIntSchemaObj value ) {
		schema = value;
	}

	public CFIntSubProjectBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactorySubProject().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableSubProject().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFIntSubProjectBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFIntSubProjectBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFIntSubProjectBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerParentTPrj = null;
	}

	public CFIntSubProjectBuff getSubProjectBuff() {
		return( (CFIntSubProjectBuff)getBuff() );
	}

	public CFIntSubProjectPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFBamSchema)schema.getBackingStore()).getFactorySubProject().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFIntSubProjectPKey value ) {
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

	public ICFIntSubProjectEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFIntSubProjectObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFIntSubProjectObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getSubProjectTableObj().lockSubProject( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getSubProjectTableObj().newEditInstance( lockobj );
		return( (ICFIntSubProjectEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFIntSubProjectEditObj getEdit() {
		return( edit );
	}

	public ICFIntSubProjectEditObj getEditAsSubProject() {
		return( (ICFIntSubProjectEditObj)edit );
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

	public String getOptionalDescription() {
		return( getSubProjectBuff().getOptionalDescription() );
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

	public ICFIntTopProjectObj getRequiredContainerParentTPrj() {
		return( getRequiredContainerParentTPrj( false ) );
	}

	public ICFIntTopProjectObj getRequiredContainerParentTPrj( boolean forceRead ) {
		if( ( requiredContainerParentTPrj == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerParentTPrj = ((ICFBamSchemaObj)schema).getTopProjectTableObj().readTopProjectByIdIdx( getPKey().getRequiredTenantId(),
					getSubProjectBuff().getRequiredTopProjectId(), forceRead );
			}
		}
		return( requiredContainerParentTPrj );
	}

	public List<ICFIntMajorVersionObj> getOptionalComponentsMajorVer() {
		List<ICFIntMajorVersionObj> retval;
		retval = ((ICFBamSchemaObj)schema).getMajorVersionTableObj().readMajorVersionBySubProjectIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFIntMajorVersionObj> getOptionalComponentsMajorVer( boolean forceRead ) {
		List<ICFIntMajorVersionObj> retval;
		retval = ((ICFBamSchemaObj)schema).getMajorVersionTableObj().readMajorVersionBySubProjectIdx( getPKey().getRequiredTenantId(),
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
