// Description: Java 11 edit object instance implementation for CFBam TopDomain.

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

public class CFBamTopDomainEditObj
	implements ICFBamTopDomainEditObj
{
	protected ICFIntTopDomainObj orig;
	protected CFIntTopDomainBuff buff;
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected ICFSecTenantObj requiredOwnerTenant;
	protected ICFIntTldObj requiredContainerParentTld;

	public CFBamTopDomainEditObj( ICFIntTopDomainObj argOrig ) {
		orig = argOrig;
		getBuff();
		CFIntTopDomainBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerParentTld = null;
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
		return( CFBamTopDomainObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		ICFIntTopDomainObj retobj = getSchema().getTopDomainTableObj().realiseTopDomain( (ICFBamTopDomainObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTopDomain().forget();
	}

	public ICFIntTopDomainObj read() {
		ICFIntTopDomainObj retval = getOrigAsTopDomain().read();
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFIntTopDomainObj read( boolean forceRead ) {
		ICFIntTopDomainObj retval = getOrigAsTopDomain().read( forceRead );
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFIntTopDomainObj create() {
		copyBuffToOrig();
		ICFIntTopDomainObj retobj = ((ICFBamSchemaObj)getOrigAsTopDomain().getSchema()).getTopDomainTableObj().createTopDomain( getOrigAsTopDomain() );
		if( retobj == getOrigAsTopDomain() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFIntTopDomainEditObj update() {
		getSchema().getTopDomainTableObj().updateTopDomain( (ICFIntTopDomainObj)this );
		return( null );
	}

	public CFIntTopDomainEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTopDomainTableObj().deleteTopDomain( getOrigAsTopDomain() );
		return( null );
	}

	public ICFIntTopDomainTableObj getTopDomainTable() {
		return( orig.getSchema().getTopDomainTableObj() );
	}

	public ICFIntTopDomainEditObj getEdit() {
		return( (ICFIntTopDomainEditObj)this );
	}

	public ICFIntTopDomainEditObj getEditAsTopDomain() {
		return( (ICFIntTopDomainEditObj)this );
	}

	public ICFIntTopDomainEditObj beginEdit() {
		throw new CFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public ICFIntTopDomainObj getOrig() {
		return( orig );
	}

	public ICFIntTopDomainObj getOrigAsTopDomain() {
		return( (ICFIntTopDomainObj)orig );
	}

	public ICFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public CFIntTopDomainBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsTopDomain().getSchema().getBackingStore()).getFactoryTopDomain().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFIntTopDomainBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerParentTld = null;
		}
	}

	public CFIntTopDomainBuff getTopDomainBuff() {
		return( (CFIntTopDomainBuff)getBuff() );
	}

	public CFIntTopDomainPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( CFIntTopDomainPKey value ) {
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

	public long getRequiredTldId() {
		return( getTopDomainBuff().getRequiredTldId() );
	}

	public String getRequiredName() {
		return( getTopDomainBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getTopDomainBuff().getRequiredName() != value ) {
			getTopDomainBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescription() {
		return( getTopDomainBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getTopDomainBuff().getOptionalDescription() != value ) {
			getTopDomainBuff().setOptionalDescription( value );
		}
	}

	public ICFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFSecTenantObj obj = ((ICFBamSchemaObj)getOrigAsTopDomain().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( ICFSecTenantObj value ) {
			if( buff == null ) {
				getTopDomainBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getTopDomainBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public ICFIntTldObj getRequiredContainerParentTld() {
		return( getRequiredContainerParentTld( false ) );
	}

	public ICFIntTldObj getRequiredContainerParentTld( boolean forceRead ) {
		if( forceRead || ( requiredContainerParentTld == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFIntTldObj obj = ((ICFBamSchemaObj)getOrigAsTopDomain().getSchema()).getTldTableObj().readTldByIdIdx( getPKey().getRequiredTenantId(),
					getTopDomainBuff().getRequiredTldId() );
				requiredContainerParentTld = obj;
				if( obj != null ) {
					getTopDomainBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTopDomainBuff().setRequiredTldId( obj.getRequiredId() );
					requiredContainerParentTld = obj;
				}
			}
		}
		return( requiredContainerParentTld );
	}

	public void setRequiredContainerParentTld( ICFIntTldObj value ) {
			if( buff == null ) {
				getTopDomainBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTopDomainBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTopDomainBuff().setRequiredTldId( value.getRequiredId() );
			}
			requiredContainerParentTld = value;
	}

	public List<ICFIntTopProjectObj> getOptionalComponentsTopProject() {
		List<ICFIntTopProjectObj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsTopDomain().getSchema()).getTopProjectTableObj().readTopProjectByTopDomainIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFIntTopProjectObj> getOptionalComponentsTopProject( boolean forceRead ) {
		List<ICFIntTopProjectObj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsTopDomain().getSchema()).getTopProjectTableObj().readTopProjectByTopDomainIdx( getPKey().getRequiredTenantId(),
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
		CFIntTopDomainBuff origBuff = getOrigAsTopDomain().getTopDomainBuff();
		CFIntTopDomainBuff myBuff = getTopDomainBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFIntTopDomainBuff origBuff = getOrigAsTopDomain().getTopDomainBuff();
		CFIntTopDomainBuff myBuff = getTopDomainBuff();
		myBuff.set( origBuff );
	}
}
