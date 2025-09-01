// Description: Java 11 edit object instance implementation for CFBam ServerListFunc.

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

public class CFBamServerListFuncEditObj
	extends CFBamServerMethodEditObj

	implements ICFBamServerListFuncEditObj
{
	protected ICFBamTableObj optionalLookupRetTable;

	public CFBamServerListFuncEditObj( ICFBamServerListFuncObj argOrig ) {
		super( argOrig );
		optionalLookupRetTable = null;
	}

	public String getClassCode() {
		return( CFBamServerListFuncObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ServerListFunc" );
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

	public ICFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamServerListFuncObj retobj = getSchema().getServerListFuncTableObj().realiseServerListFunc( (ICFBamServerListFuncObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsServerListFunc().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamServerListFuncObj retobj = ((ICFBamSchemaObj)getOrigAsServerListFunc().getSchema()).getServerListFuncTableObj().createServerListFunc( getOrigAsServerListFunc() );
		if( retobj == getOrigAsServerListFunc() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getServerListFuncTableObj().updateServerListFunc( (ICFBamServerListFuncObj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getServerListFuncTableObj().deleteServerListFunc( getOrigAsServerListFunc() );
		return( null );
	}

	public ICFBamServerListFuncTableObj getServerListFuncTable() {
		return( orig.getSchema().getServerListFuncTableObj() );
	}

	public ICFBamServerListFuncEditObj getEditAsServerListFunc() {
		return( (ICFBamServerListFuncEditObj)this );
	}

	public ICFBamServerListFuncObj getOrigAsServerListFunc() {
		return( (ICFBamServerListFuncObj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsServerListFunc().getSchema().getBackingStore()).getFactoryServerListFunc().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupRetTable = null;
		}
	}

	public CFBamServerListFuncBuff getServerListFuncBuff() {
		return( (CFBamServerListFuncBuff)getBuff() );
	}

	public Long getOptionalRetTenantId() {
		return( getServerListFuncBuff().getOptionalRetTenantId() );
	}

	public Long getOptionalRetTableId() {
		return( getServerListFuncBuff().getOptionalRetTableId() );
	}

	public ICFBamTableObj getOptionalLookupRetTable() {
		return( getOptionalLookupRetTable( false ) );
	}

	public ICFBamTableObj getOptionalLookupRetTable( boolean forceRead ) {
		if( forceRead || ( optionalLookupRetTable == null ) ) {
			boolean anyMissing = false;
			if( getServerListFuncBuff().getOptionalRetTenantId() == null ) {
				anyMissing = true;
			}
			if( getServerListFuncBuff().getOptionalRetTableId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsServerListFunc().getSchema()).getTableTableObj().readTableByIdIdx( getServerListFuncBuff().getOptionalRetTenantId(),
					getServerListFuncBuff().getOptionalRetTableId() );
				optionalLookupRetTable = obj;
			}
		}
		return( optionalLookupRetTable );
	}

	public void setOptionalLookupRetTable( ICFBamTableObj value ) {
			if( buff == null ) {
				getServerListFuncBuff();
			}
			if( value != null ) {
				getServerListFuncBuff().setOptionalRetTenantId( value.getRequiredTenantId() );
				getServerListFuncBuff().setOptionalRetTableId( value.getRequiredId() );
			}
			else {
				getServerListFuncBuff().setOptionalRetTenantId( null );
				getServerListFuncBuff().setOptionalRetTableId( null );
			}
			optionalLookupRetTable = value;
	}

	public void copyBuffToOrig() {
		CFBamServerListFuncBuff origBuff = getOrigAsServerListFunc().getServerListFuncBuff();
		CFBamServerListFuncBuff myBuff = getServerListFuncBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamServerListFuncBuff origBuff = getOrigAsServerListFunc().getServerListFuncBuff();
		CFBamServerListFuncBuff myBuff = getServerListFuncBuff();
		myBuff.set( origBuff );
	}
}
