// Description: Java 11 base object instance implementation for CFBam SysCluster.

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

public class CFBamSysClusterObj
	implements ICFBamSysClusterObj
{
	public final static String CLASS_CODE = "a014";
	protected boolean isNew;
	protected ICFSecSysClusterEditObj edit;
	protected ICFSecSchemaObj schema;
	protected CFSecSysClusterPKey pKey;
	protected CFSecSysClusterBuff buff;
	protected ICFSecClusterObj requiredContainerCluster;

	public CFBamSysClusterObj() {
		isNew = true;
		requiredContainerCluster = null;
	}

	public CFBamSysClusterObj( ICFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SysCluster" );
	}

	public ICFLibAnyObj getScope() {
		ICFSecClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFSecClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public String getObjName() {
		String objName;
		int val = getRequiredSingletonId();
		objName = Integer.toString( val );
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

	public ICFSecSysClusterObj realise() {
		ICFSecSysClusterObj retobj = ((ICFBamSchemaObj)schema).getSysClusterTableObj().realiseSysCluster(
			(ICFSecSysClusterObj)this );
		return( (ICFSecSysClusterObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getSysClusterTableObj().reallyDeepDisposeSysCluster( (ICFSecSysClusterObj)this );
	}

	public ICFSecSysClusterObj read() {
		ICFSecSysClusterObj retobj = ((ICFBamSchemaObj)schema).getSysClusterTableObj().readSysClusterByIdIdx( getPKey().getRequiredSingletonId(), false );
		return( (ICFSecSysClusterObj)retobj );
	}

	public ICFSecSysClusterObj read( boolean forceRead ) {
		ICFSecSysClusterObj retobj = ((ICFBamSchemaObj)schema).getSysClusterTableObj().readSysClusterByIdIdx( getPKey().getRequiredSingletonId(), forceRead );
		return( (ICFSecSysClusterObj)retobj );
	}

	public ICFSecSysClusterTableObj getSysClusterTable() {
		return( ((ICFBamSchemaObj)schema).getSysClusterTableObj() );
	}

	public ICFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFSecSchemaObj value ) {
		schema = value;
	}

	public CFSecSysClusterBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactorySysCluster().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableSysCluster().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredSingletonId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFSecSysClusterBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFSecSysClusterBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFSecSysClusterBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCluster = null;
	}

	public CFSecSysClusterBuff getSysClusterBuff() {
		return( (CFSecSysClusterBuff)getBuff() );
	}

	public CFSecSysClusterPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFBamSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFSecSysClusterPKey value ) {
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

	public ICFSecSysClusterEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFSecSysClusterObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFSecSysClusterObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getSysClusterTableObj().lockSysCluster( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getSysClusterTableObj().newEditInstance( lockobj );
		return( (ICFSecSysClusterEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFSecSysClusterEditObj getEdit() {
		return( edit );
	}

	public ICFSecSysClusterEditObj getEditAsSysCluster() {
		return( (ICFSecSysClusterEditObj)edit );
	}

	public int getRequiredSingletonId() {
		return( getPKey().getRequiredSingletonId() );
	}

	public long getRequiredClusterId() {
		return( getSysClusterBuff().getRequiredClusterId() );
	}

	public ICFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public ICFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( ( requiredContainerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCluster = ((ICFBamSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getSysClusterBuff().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredContainerCluster );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredSingletonId( getPKey().getRequiredSingletonId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSingletonId( buff.getRequiredSingletonId() );
	}
}
