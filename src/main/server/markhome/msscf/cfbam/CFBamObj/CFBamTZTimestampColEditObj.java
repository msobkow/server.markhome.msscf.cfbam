// Description: Java 11 edit object instance implementation for CFBam TZTimestampCol.

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

public class CFBamTZTimestampColEditObj
	extends CFBamTZTimestampDefEditObj

	implements ICFBamTZTimestampColEditObj
{
	protected ICFBamTableObj requiredContainerTable;

	public CFBamTZTimestampColEditObj( ICFBamTZTimestampColObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
	}

	public String getClassCode() {
		return( CFBamTZTimestampColObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TZTimestampCol" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamTableObj scope = getRequiredContainerTable();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamTableObj scope = getRequiredContainerTable();
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
		ICFBamTZTimestampColObj retobj = getSchema().getTZTimestampColTableObj().realiseTZTimestampCol( (ICFBamTZTimestampColObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTZTimestampCol().forget();
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
		ICFBamTZTimestampColObj retobj = ((ICFBamSchemaObj)getOrigAsTZTimestampCol().getSchema()).getTZTimestampColTableObj().createTZTimestampCol( getOrigAsTZTimestampCol() );
		if( retobj == getOrigAsTZTimestampCol() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getTZTimestampColTableObj().updateTZTimestampCol( (ICFBamTZTimestampColObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTZTimestampColTableObj().deleteTZTimestampCol( getOrigAsTZTimestampCol() );
		return( null );
	}

	public ICFBamTZTimestampColTableObj getTZTimestampColTable() {
		return( orig.getSchema().getTZTimestampColTableObj() );
	}

	public ICFBamTZTimestampColEditObj getEditAsTZTimestampCol() {
		return( (ICFBamTZTimestampColEditObj)this );
	}

	public ICFBamTZTimestampColObj getOrigAsTZTimestampCol() {
		return( (ICFBamTZTimestampColObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsTZTimestampCol().getSchema().getBackingStore()).getFactoryTZTimestampCol().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerTable = null;
		}
	}

	public CFBamTZTimestampColBuff getTZTimestampColBuff() {
		return( (CFBamTZTimestampColBuff)getBuff() );
	}

	public long getRequiredTableId() {
		return( getTZTimestampColBuff().getRequiredTableId() );
	}

	public void setRequiredContainerScope( ICFBamScopeObj value ) {
		final String S_ProcName = "CFBamTZTimestampColEditObj.setRequiredContainerScope() ";
		if( value == null ) {
			setRequiredContainerTable( null );
		}
		else if( ! ( value instanceof ICFBamTableObj ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setRequiredContainerScope",
				"value",
				value,
				"ICFBamTableObj" );
		}
		else {
			setRequiredContainerTable( (ICFBamTableObj)value );
		}
	}

	public ICFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public ICFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsTZTimestampCol().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getTZTimestampColBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getTZTimestampColBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTZTimestampColBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( ICFBamTableObj value ) {
			if( buff == null ) {
				getTZTimestampColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTZTimestampColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTZTimestampColBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
			super.setRequiredContainerScope( value );
	}

	public void copyBuffToOrig() {
		CFBamTZTimestampColBuff origBuff = getOrigAsTZTimestampCol().getTZTimestampColBuff();
		CFBamTZTimestampColBuff myBuff = getTZTimestampColBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamTZTimestampColBuff origBuff = getOrigAsTZTimestampCol().getTZTimestampColBuff();
		CFBamTZTimestampColBuff myBuff = getTZTimestampColBuff();
		myBuff.set( origBuff );
	}
}
