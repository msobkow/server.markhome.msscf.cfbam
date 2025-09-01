// Description: Java 11 edit object instance implementation for CFBam BlobDef.

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

public class CFBamBlobDefEditObj
	extends CFBamAtomEditObj

	implements ICFBamBlobDefEditObj
{

	public CFBamBlobDefEditObj( ICFBamBlobDefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamBlobDefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "BlobDef" );
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

	public ICFBamValueObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamBlobDefObj retobj = getSchema().getBlobDefTableObj().realiseBlobDef( (ICFBamBlobDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsBlobDef().forget();
	}

	public ICFBamValueObj moveUp() {
		throw new CFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj moveDown() {
		throw new CFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj create() {
		copyBuffToOrig();
		ICFBamBlobDefObj retobj = ((ICFBamSchemaObj)getOrigAsBlobDef().getSchema()).getBlobDefTableObj().createBlobDef( getOrigAsBlobDef() );
		if( retobj == getOrigAsBlobDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getBlobDefTableObj().updateBlobDef( (ICFBamBlobDefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getBlobDefTableObj().deleteBlobDef( getOrigAsBlobDef() );
		return( null );
	}

	public ICFBamBlobDefTableObj getBlobDefTable() {
		return( orig.getSchema().getBlobDefTableObj() );
	}

	public ICFBamBlobDefEditObj getEditAsBlobDef() {
		return( (ICFBamBlobDefEditObj)this );
	}

	public ICFBamBlobDefObj getOrigAsBlobDef() {
		return( (ICFBamBlobDefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsBlobDef().getSchema().getBackingStore()).getFactoryBlobDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamBlobDefBuff getBlobDefBuff() {
		return( (CFBamBlobDefBuff)getBuff() );
	}

	public int getRequiredMaxLen() {
		return( getBlobDefBuff().getRequiredMaxLen() );
	}

	public void setRequiredMaxLen( int value ) {
		if( getBlobDefBuff().getRequiredMaxLen() != value ) {
			getBlobDefBuff().setRequiredMaxLen( value );
		}
	}

	public byte[] getOptionalInitValue() {
		return( getBlobDefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( byte[] value ) {
		if( getBlobDefBuff().getOptionalInitValue() != value ) {
			getBlobDefBuff().setOptionalInitValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamBlobDefBuff origBuff = getOrigAsBlobDef().getBlobDefBuff();
		CFBamBlobDefBuff myBuff = getBlobDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamBlobDefBuff origBuff = getOrigAsBlobDef().getBlobDefBuff();
		CFBamBlobDefBuff myBuff = getBlobDefBuff();
		myBuff.set( origBuff );
	}
}
