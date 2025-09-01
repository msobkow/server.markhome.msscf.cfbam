// Description: Java 11 edit object instance implementation for CFBam UInt64Col.

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

public class CFBamUInt64ColEditObj
	extends CFBamUInt64DefEditObj

	implements ICFBamUInt64ColEditObj
{
	protected ICFBamTableObj requiredContainerTable;

	public CFBamUInt64ColEditObj( ICFBamUInt64ColObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
	}

	public String getClassCode() {
		return( CFBamUInt64ColObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "UInt64Col" );
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
		ICFBamUInt64ColObj retobj = getSchema().getUInt64ColTableObj().realiseUInt64Col( (ICFBamUInt64ColObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsUInt64Col().forget();
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
		ICFBamUInt64ColObj retobj = ((ICFBamSchemaObj)getOrigAsUInt64Col().getSchema()).getUInt64ColTableObj().createUInt64Col( getOrigAsUInt64Col() );
		if( retobj == getOrigAsUInt64Col() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getUInt64ColTableObj().updateUInt64Col( (ICFBamUInt64ColObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getUInt64ColTableObj().deleteUInt64Col( getOrigAsUInt64Col() );
		return( null );
	}

	public ICFBamUInt64ColTableObj getUInt64ColTable() {
		return( orig.getSchema().getUInt64ColTableObj() );
	}

	public ICFBamUInt64ColEditObj getEditAsUInt64Col() {
		return( (ICFBamUInt64ColEditObj)this );
	}

	public ICFBamUInt64ColObj getOrigAsUInt64Col() {
		return( (ICFBamUInt64ColObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsUInt64Col().getSchema().getBackingStore()).getFactoryUInt64Col().newBuff();
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

	public CFBamUInt64ColBuff getUInt64ColBuff() {
		return( (CFBamUInt64ColBuff)getBuff() );
	}

	public long getRequiredTableId() {
		return( getUInt64ColBuff().getRequiredTableId() );
	}

	public void setRequiredContainerScope( ICFBamScopeObj value ) {
		final String S_ProcName = "CFBamUInt64ColEditObj.setRequiredContainerScope() ";
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
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsUInt64Col().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getUInt64ColBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getUInt64ColBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getUInt64ColBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( ICFBamTableObj value ) {
			if( buff == null ) {
				getUInt64ColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getUInt64ColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getUInt64ColBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
			super.setRequiredContainerScope( value );
	}

	public void copyBuffToOrig() {
		CFBamUInt64ColBuff origBuff = getOrigAsUInt64Col().getUInt64ColBuff();
		CFBamUInt64ColBuff myBuff = getUInt64ColBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamUInt64ColBuff origBuff = getOrigAsUInt64Col().getUInt64ColBuff();
		CFBamUInt64ColBuff myBuff = getUInt64ColBuff();
		myBuff.set( origBuff );
	}
}
