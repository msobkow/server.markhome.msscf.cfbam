// Description: Java 11 edit object instance implementation for CFBam URLProtocol.

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

public class CFBamURLProtocolEditObj
	implements ICFBamURLProtocolEditObj
{
	protected ICFIntURLProtocolObj orig;
	protected CFIntURLProtocolBuff buff;
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;

	public CFBamURLProtocolEditObj( ICFIntURLProtocolObj argOrig ) {
		orig = argOrig;
		getBuff();
		CFIntURLProtocolBuff origBuff = orig.getBuff();
		buff.set( origBuff );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFIntURLProtocolBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFIntURLProtocolBuff buff = getBuff();
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
		return( CFBamURLProtocolObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "URLProtocol" );
	}

	public ICFLibAnyObj getScope() {
		return( null );
	}

	public ICFLibAnyObj getObjScope() {
		return( null );
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

	public ICFIntURLProtocolObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFIntURLProtocolObj retobj = getSchema().getURLProtocolTableObj().realiseURLProtocol( (ICFBamURLProtocolObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsURLProtocol().forget();
	}

	public ICFIntURLProtocolObj read() {
		ICFIntURLProtocolObj retval = getOrigAsURLProtocol().read();
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFIntURLProtocolObj read( boolean forceRead ) {
		ICFIntURLProtocolObj retval = getOrigAsURLProtocol().read( forceRead );
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFIntURLProtocolObj create() {
		copyBuffToOrig();
		ICFIntURLProtocolObj retobj = ((ICFBamSchemaObj)getOrigAsURLProtocol().getSchema()).getURLProtocolTableObj().createURLProtocol( getOrigAsURLProtocol() );
		if( retobj == getOrigAsURLProtocol() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFIntURLProtocolEditObj update() {
		getSchema().getURLProtocolTableObj().updateURLProtocol( (ICFIntURLProtocolObj)this );
		return( null );
	}

	public CFIntURLProtocolEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getURLProtocolTableObj().deleteURLProtocol( getOrigAsURLProtocol() );
		return( null );
	}

	public ICFIntURLProtocolTableObj getURLProtocolTable() {
		return( orig.getSchema().getURLProtocolTableObj() );
	}

	public ICFIntURLProtocolEditObj getEdit() {
		return( (ICFIntURLProtocolEditObj)this );
	}

	public ICFIntURLProtocolEditObj getEditAsURLProtocol() {
		return( (ICFIntURLProtocolEditObj)this );
	}

	public ICFIntURLProtocolEditObj beginEdit() {
		throw new CFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public ICFIntURLProtocolObj getOrig() {
		return( orig );
	}

	public ICFIntURLProtocolObj getOrigAsURLProtocol() {
		return( (ICFIntURLProtocolObj)orig );
	}

	public ICFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public CFIntURLProtocolBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsURLProtocol().getSchema().getBackingStore()).getFactoryURLProtocol().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFIntURLProtocolBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public CFIntURLProtocolBuff getURLProtocolBuff() {
		return( (CFIntURLProtocolBuff)getBuff() );
	}

	public CFIntURLProtocolPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( CFIntURLProtocolPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public int getRequiredURLProtocolId() {
		return( getPKey().getRequiredURLProtocolId() );
	}

	public String getRequiredName() {
		return( getURLProtocolBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getURLProtocolBuff().getRequiredName() != value ) {
			getURLProtocolBuff().setRequiredName( value );
		}
	}

	public String getRequiredDescription() {
		return( getURLProtocolBuff().getRequiredDescription() );
	}

	public void setRequiredDescription( String value ) {
		if( getURLProtocolBuff().getRequiredDescription() != value ) {
			getURLProtocolBuff().setRequiredDescription( value );
		}
	}

	public boolean getRequiredIsSecure() {
		return( getURLProtocolBuff().getRequiredIsSecure() );
	}

	public void setRequiredIsSecure( boolean value ) {
		if( getURLProtocolBuff().getRequiredIsSecure() != value ) {
			getURLProtocolBuff().setRequiredIsSecure( value );
		}
	}

	public void copyPKeyToBuff() {
		buff.setRequiredURLProtocolId( getPKey().getRequiredURLProtocolId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredURLProtocolId( buff.getRequiredURLProtocolId() );
	}

	public void copyBuffToOrig() {
		CFIntURLProtocolBuff origBuff = getOrigAsURLProtocol().getURLProtocolBuff();
		CFIntURLProtocolBuff myBuff = getURLProtocolBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFIntURLProtocolBuff origBuff = getOrigAsURLProtocol().getURLProtocolBuff();
		CFIntURLProtocolBuff myBuff = getURLProtocolBuff();
		myBuff.set( origBuff );
	}
}
