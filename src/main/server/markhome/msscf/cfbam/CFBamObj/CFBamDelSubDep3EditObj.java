// Description: Java 11 edit object instance implementation for CFBam DelSubDep3.

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

public class CFBamDelSubDep3EditObj
	extends CFBamDelDepEditObj

	implements ICFBamDelSubDep3EditObj
{
	protected ICFBamDelSubDep2Obj requiredContainerDelSubDep2;

	public CFBamDelSubDep3EditObj( ICFBamDelSubDep3Obj argOrig ) {
		super( argOrig );
		requiredContainerDelSubDep2 = null;
	}

	public String getClassCode() {
		return( CFBamDelSubDep3Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelSubDep3" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamDelSubDep2Obj scope = getRequiredContainerDelSubDep2();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamDelSubDep2Obj scope = getRequiredContainerDelSubDep2();
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

	public ICFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamDelSubDep3Obj retobj = getSchema().getDelSubDep3TableObj().realiseDelSubDep3( (ICFBamDelSubDep3Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDelSubDep3().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamDelSubDep3Obj retobj = ((ICFBamSchemaObj)getOrigAsDelSubDep3().getSchema()).getDelSubDep3TableObj().createDelSubDep3( getOrigAsDelSubDep3() );
		if( retobj == getOrigAsDelSubDep3() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getDelSubDep3TableObj().updateDelSubDep3( (ICFBamDelSubDep3Obj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDelSubDep3TableObj().deleteDelSubDep3( getOrigAsDelSubDep3() );
		return( null );
	}

	public ICFBamDelSubDep3TableObj getDelSubDep3Table() {
		return( orig.getSchema().getDelSubDep3TableObj() );
	}

	public ICFBamDelSubDep3EditObj getEditAsDelSubDep3() {
		return( (ICFBamDelSubDep3EditObj)this );
	}

	public ICFBamDelSubDep3Obj getOrigAsDelSubDep3() {
		return( (ICFBamDelSubDep3Obj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDelSubDep3().getSchema().getBackingStore()).getFactoryDelSubDep3().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerDelSubDep2 = null;
		}
	}

	public CFBamDelSubDep3Buff getDelSubDep3Buff() {
		return( (CFBamDelSubDep3Buff)getBuff() );
	}

	public long getRequiredDelSubDep2TenantId() {
		return( getDelSubDep3Buff().getRequiredDelSubDep2TenantId() );
	}

	public long getRequiredDelSubDep2Id() {
		return( getDelSubDep3Buff().getRequiredDelSubDep2Id() );
	}

	public String getRequiredName() {
		return( getDelSubDep3Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getDelSubDep3Buff().getRequiredName() != value ) {
			getDelSubDep3Buff().setRequiredName( value );
		}
	}

	public ICFBamDelSubDep2Obj getRequiredContainerDelSubDep2() {
		return( getRequiredContainerDelSubDep2( false ) );
	}

	public ICFBamDelSubDep2Obj getRequiredContainerDelSubDep2( boolean forceRead ) {
		if( forceRead || ( requiredContainerDelSubDep2 == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamDelSubDep2Obj obj = ((ICFBamSchemaObj)getOrigAsDelSubDep3().getSchema()).getDelSubDep2TableObj().readDelSubDep2ByIdIdx( getDelSubDep3Buff().getRequiredDelSubDep2TenantId(),
					getDelSubDep3Buff().getRequiredDelSubDep2Id() );
				requiredContainerDelSubDep2 = obj;
				if( obj != null ) {
					getDelSubDep3Buff().setRequiredDelSubDep2TenantId( obj.getRequiredTenantId() );
					getDelSubDep3Buff().setRequiredDelSubDep2Id( obj.getRequiredId() );
					requiredContainerDelSubDep2 = obj;
				}
			}
		}
		return( requiredContainerDelSubDep2 );
	}

	public void setRequiredContainerDelSubDep2( ICFBamDelSubDep2Obj value ) {
			if( buff == null ) {
				getDelSubDep3Buff();
			}
			if( value != null ) {
				getDelSubDep3Buff().setRequiredDelSubDep2TenantId( value.getRequiredTenantId() );
				getDelSubDep3Buff().setRequiredDelSubDep2Id( value.getRequiredId() );
			}
			requiredContainerDelSubDep2 = value;
	}

	public void copyBuffToOrig() {
		CFBamDelSubDep3Buff origBuff = getOrigAsDelSubDep3().getDelSubDep3Buff();
		CFBamDelSubDep3Buff myBuff = getDelSubDep3Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDelSubDep3Buff origBuff = getOrigAsDelSubDep3().getDelSubDep3Buff();
		CFBamDelSubDep3Buff myBuff = getDelSubDep3Buff();
		myBuff.set( origBuff );
	}
}
