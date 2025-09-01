// Description: Java 11 base object instance implementation for CFBam ISOCtryCcy.

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

public class CFBamISOCtryCcyObj
	implements ICFBamISOCtryCcyObj
{
	public final static String CLASS_CODE = "a005";
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ICFSecISOCtryCcyEditObj edit;
	protected ICFSecSchemaObj schema;
	protected CFSecISOCtryCcyPKey pKey;
	protected CFSecISOCtryCcyBuff buff;
	protected ICFSecISOCtryObj requiredContainerCtry;
	protected ICFSecISOCcyObj requiredParentCcy;

	public CFBamISOCtryCcyObj() {
		isNew = true;
		requiredContainerCtry = null;
		requiredParentCcy = null;
	}

	public CFBamISOCtryCcyObj( ICFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCtry = null;
		requiredParentCcy = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ISOCtryCcy" );
	}

	public ICFLibAnyObj getScope() {
		ICFSecISOCtryObj scope = getRequiredContainerCtry();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFSecISOCtryObj scope = getRequiredContainerCtry();
		return( scope );
	}

	public String getObjName() {
		String objName;
		short val = getRequiredISOCcyId();
		objName = Short.toString( val );
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

	public ICFSecISOCtryCcyObj realise() {
		ICFSecISOCtryCcyObj retobj = ((ICFBamSchemaObj)schema).getISOCtryCcyTableObj().realiseISOCtryCcy(
			(ICFSecISOCtryCcyObj)this );
		return( (ICFSecISOCtryCcyObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getISOCtryCcyTableObj().reallyDeepDisposeISOCtryCcy( (ICFSecISOCtryCcyObj)this );
	}

	public ICFSecISOCtryCcyObj read() {
		ICFSecISOCtryCcyObj retobj = ((ICFBamSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByIdIdx( getPKey().getRequiredISOCtryId(),
			getPKey().getRequiredISOCcyId(), false );
		return( (ICFSecISOCtryCcyObj)retobj );
	}

	public ICFSecISOCtryCcyObj read( boolean forceRead ) {
		ICFSecISOCtryCcyObj retobj = ((ICFBamSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByIdIdx( getPKey().getRequiredISOCtryId(),
			getPKey().getRequiredISOCcyId(), forceRead );
		return( (ICFSecISOCtryCcyObj)retobj );
	}

	public ICFSecISOCtryCcyTableObj getISOCtryCcyTable() {
		return( ((ICFBamSchemaObj)schema).getISOCtryCcyTableObj() );
	}

	public ICFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFSecSchemaObj value ) {
		schema = value;
	}

	public CFSecISOCtryCcyBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableISOCtryCcy().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredISOCtryId(),
						getPKey().getRequiredISOCcyId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFSecISOCtryCcyBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFSecISOCtryCcyBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFSecISOCtryCcyBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCtry = null;
		requiredParentCcy = null;
	}

	public CFSecISOCtryCcyBuff getISOCtryCcyBuff() {
		return( (CFSecISOCtryCcyBuff)getBuff() );
	}

	public CFSecISOCtryCcyPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFBamSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFSecISOCtryCcyPKey value ) {
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

	public ICFSecISOCtryCcyEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFSecISOCtryCcyObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFSecISOCtryCcyObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getISOCtryCcyTableObj().lockISOCtryCcy( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getISOCtryCcyTableObj().newEditInstance( lockobj );
		return( (ICFSecISOCtryCcyEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFSecISOCtryCcyEditObj getEdit() {
		return( edit );
	}

	public ICFSecISOCtryCcyEditObj getEditAsISOCtryCcy() {
		return( (ICFSecISOCtryCcyEditObj)edit );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFSecISOCtryCcyBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFSecISOCtryCcyBuff buff = getBuff();
			updatedBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public short getRequiredISOCtryId() {
		return( getPKey().getRequiredISOCtryId() );
	}

	public short getRequiredISOCcyId() {
		return( getPKey().getRequiredISOCcyId() );
	}

	public ICFSecISOCtryObj getRequiredContainerCtry() {
		return( getRequiredContainerCtry( false ) );
	}

	public ICFSecISOCtryObj getRequiredContainerCtry( boolean forceRead ) {
		if( ( requiredContainerCtry == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCtry = ((ICFBamSchemaObj)schema).getISOCtryTableObj().readISOCtryByIdIdx( getPKey().getRequiredISOCtryId(), forceRead );
			}
		}
		return( requiredContainerCtry );
	}

	public ICFSecISOCcyObj getRequiredParentCcy() {
		return( getRequiredParentCcy( false ) );
	}

	public ICFSecISOCcyObj getRequiredParentCcy( boolean forceRead ) {
		if( ( requiredParentCcy == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentCcy = ((ICFBamSchemaObj)schema).getISOCcyTableObj().readISOCcyByIdIdx( getPKey().getRequiredISOCcyId(), forceRead );
			}
		}
		return( requiredParentCcy );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredISOCtryId( getPKey().getRequiredISOCtryId() );
			buff.setRequiredISOCcyId( getPKey().getRequiredISOCcyId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOCtryId( buff.getRequiredISOCtryId() );
		getPKey().setRequiredISOCcyId( buff.getRequiredISOCcyId() );
	}
}
