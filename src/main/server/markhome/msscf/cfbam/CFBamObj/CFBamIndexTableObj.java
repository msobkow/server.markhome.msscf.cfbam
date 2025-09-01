// Description: Java 11 Table Object implementation for CFBam.

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

public class CFBamIndexTableObj
	implements ICFBamIndexTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamIndexObj> members;
	private Map<CFBamScopePKey, ICFBamIndexObj> allIndex;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamIndexObj > > indexByTenantIdx;
	private Map< CFBamIndexByUNameIdxKey,
		ICFBamIndexObj > indexByUNameIdx;
	private Map< CFBamIndexByIndexTenantIdxKey,
		Map<CFBamScopePKey, ICFBamIndexObj > > indexByIndexTenantIdx;
	private Map< CFBamIndexByIdxTableIdxKey,
		Map<CFBamScopePKey, ICFBamIndexObj > > indexByIdxTableIdx;
	private Map< CFBamIndexByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamIndexObj > > indexByDefSchemaIdx;
	public static String TABLE_NAME = "Index";
	public static String TABLE_DBNAME = "idxdef";

	public CFBamIndexTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamIndexObj>();
		allIndex = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByIndexTenantIdx = null;
		indexByIdxTableIdx = null;
		indexByDefSchemaIdx = null;
	}

	public CFBamIndexTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamIndexObj>();
		allIndex = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByIndexTenantIdx = null;
		indexByIdxTableIdx = null;
		indexByDefSchemaIdx = null;
	}

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allIndex = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByIndexTenantIdx = null;
		indexByIdxTableIdx = null;
		indexByDefSchemaIdx = null;
		List<ICFBamIndexObj> toForget = new LinkedList<ICFBamIndexObj>();
		ICFBamIndexObj cur = null;
		Iterator<ICFBamIndexObj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamIndexObj.
	 */
	public ICFBamIndexObj newInstance() {
		ICFBamIndexObj inst = new CFBamIndexObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamIndexObj.
	 */
	public ICFBamIndexEditObj newEditInstance( ICFBamIndexObj orig ) {
		ICFBamIndexEditObj edit = new CFBamIndexEditObj( orig );
		return( edit );
	}

	public ICFBamIndexObj realiseIndex( ICFBamIndexObj Obj ) {
		ICFBamIndexObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamIndexObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamIndexObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamIndexByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByIndexTenantIdx != null ) {
				CFBamIndexByIndexTenantIdxKey keyIndexTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
				keyIndexTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapIndexTenantIdx = indexByIndexTenantIdx.get( keyIndexTenantIdx );
				if( mapIndexTenantIdx != null ) {
					mapIndexTenantIdx.remove( keepObj.getPKey() );
					if( mapIndexTenantIdx.size() <= 0 ) {
						indexByIndexTenantIdx.remove( keyIndexTenantIdx );
					}
				}
			}

			if( indexByIdxTableIdx != null ) {
				CFBamIndexByIdxTableIdxKey keyIdxTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
				keyIdxTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapIdxTableIdx = indexByIdxTableIdx.get( keyIdxTableIdx );
				if( mapIdxTableIdx != null ) {
					mapIdxTableIdx.remove( keepObj.getPKey() );
					if( mapIdxTableIdx.size() <= 0 ) {
						indexByIdxTableIdx.remove( keyIdxTableIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamIndexByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamIndexObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamIndexByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIndexTenantIdx != null ) {
				CFBamIndexByIndexTenantIdxKey keyIndexTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
				keyIndexTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapIndexTenantIdx = indexByIndexTenantIdx.get( keyIndexTenantIdx );
				if( mapIndexTenantIdx != null ) {
					mapIndexTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxTableIdx != null ) {
				CFBamIndexByIdxTableIdxKey keyIdxTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
				keyIdxTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapIdxTableIdx = indexByIdxTableIdx.get( keyIdxTableIdx );
				if( mapIdxTableIdx != null ) {
					mapIdxTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamIndexByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allIndex != null ) {
				allIndex.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFBamIndexObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allIndex != null ) {
				allIndex.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamIndexByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIndexTenantIdx != null ) {
				CFBamIndexByIndexTenantIdxKey keyIndexTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
				keyIndexTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapIndexTenantIdx = indexByIndexTenantIdx.get( keyIndexTenantIdx );
				if( mapIndexTenantIdx != null ) {
					mapIndexTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxTableIdx != null ) {
				CFBamIndexByIdxTableIdxKey keyIdxTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
				keyIdxTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapIdxTableIdx = indexByIdxTableIdx.get( keyIdxTableIdx );
				if( mapIdxTableIdx != null ) {
					mapIdxTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamIndexByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamIndexObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamIndexObj createIndex( ICFBamIndexObj Obj ) {
		ICFBamIndexObj obj = Obj;
		CFBamIndexBuff buff = obj.getIndexBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableIndex().createIndex(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a821" ) ) {
			obj = (ICFBamIndexObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamIndexObj readIndex( CFBamScopePKey pkey ) {
		return( readIndex( pkey, false ) );
	}

	public ICFBamIndexObj readIndex( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamIndexObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamIndexBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamIndexObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamIndexObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamIndexObj readCachedIndex( CFBamScopePKey pkey ) {
		ICFBamIndexObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeIndex( ICFBamIndexObj obj )
	{
		final String S_ProcName = "CFBamIndexTableObj.reallyDeepDisposeIndex() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamIndexObj existing = readCachedIndex( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamIndexByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamIndexByIndexTenantIdxKey keyIndexTenantIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
		keyIndexTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFBamIndexByIdxTableIdxKey keyIdxTableIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
		keyIdxTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIdxTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		CFBamIndexByDefSchemaIdxKey keyDefSchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );


		ICFBamIndexColObj objDelIndexRefRelFromCols;
		List<ICFBamIndexColObj> arrDelIndexRefRelFromCols = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamIndexColObj> iterDelIndexRefRelFromCols = arrDelIndexRefRelFromCols.iterator();
		while( iterDelIndexRefRelFromCols.hasNext() ) {
			objDelIndexRefRelFromCols = iterDelIndexRefRelFromCols.next();
			if( objDelIndexRefRelFromCols != null ) {
						schema.getRelationColTableObj().deepDisposeRelationColByFromColIdx( objDelIndexRefRelFromCols.getRequiredTenantId(),
							objDelIndexRefRelFromCols.getRequiredId() );
			}
		}
		ICFBamIndexColObj objDelIndexRefRelToCols;
		List<ICFBamIndexColObj> arrDelIndexRefRelToCols = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamIndexColObj> iterDelIndexRefRelToCols = arrDelIndexRefRelToCols.iterator();
		while( iterDelIndexRefRelToCols.hasNext() ) {
			objDelIndexRefRelToCols = iterDelIndexRefRelToCols.next();
			if( objDelIndexRefRelToCols != null ) {
						schema.getRelationColTableObj().deepDisposeRelationColByToColIdx( objDelIndexRefRelToCols.getRequiredTenantId(),
							objDelIndexRefRelToCols.getRequiredId() );
			}
		}
					schema.getIndexColTableObj().deepDisposeIndexColByIndexIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByIndexTenantIdx != null ) {
			if( indexByIndexTenantIdx.containsKey( keyIndexTenantIdx ) ) {
				indexByIndexTenantIdx.get( keyIndexTenantIdx ).remove( pkey );
				if( indexByIndexTenantIdx.get( keyIndexTenantIdx ).size() <= 0 ) {
					indexByIndexTenantIdx.remove( keyIndexTenantIdx );
				}
			}
		}

		if( indexByIdxTableIdx != null ) {
			if( indexByIdxTableIdx.containsKey( keyIdxTableIdx ) ) {
				indexByIdxTableIdx.get( keyIdxTableIdx ).remove( pkey );
				if( indexByIdxTableIdx.get( keyIdxTableIdx ).size() <= 0 ) {
					indexByIdxTableIdx.remove( keyIdxTableIdx );
				}
			}
		}

		if( indexByDefSchemaIdx != null ) {
			if( indexByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
				indexByDefSchemaIdx.get( keyDefSchemaIdx ).remove( pkey );
				if( indexByDefSchemaIdx.get( keyDefSchemaIdx ).size() <= 0 ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}
		}


		schema.getScopeTableObj().reallyDeepDisposeScope( obj );
	}
	public void deepDisposeIndex( CFBamScopePKey pkey ) {
		ICFBamIndexObj obj = readCachedIndex( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamIndexObj lockIndex( CFBamScopePKey pkey ) {
		ICFBamIndexObj locked = null;
		CFBamIndexBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableIndex().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamIndexObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamIndexObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockIndex", pkey );
		}
		return( locked );
	}

	public List<ICFBamIndexObj> readAllIndex() {
		return( readAllIndex( false ) );
	}

	public List<ICFBamIndexObj> readAllIndex( boolean forceRead ) {
		final String S_ProcName = "readAllIndex";
		if( ( allIndex == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamIndexObj> map = new HashMap<CFBamScopePKey,ICFBamIndexObj>();
			allIndex = map;
			CFBamIndexBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndex().readAllDerived( schema.getAuthorization() );
			CFBamIndexBuff buff;
			ICFBamIndexObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexObj realised = (ICFBamIndexObj)obj.realise();
			}
		}
		int len = allIndex.size();
		ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
		Iterator<ICFBamIndexObj> valIter = allIndex.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexObj> readCachedAllIndex() {
		final String S_ProcName = "readCachedAllIndex";
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>();
		if( allIndex != null ) {
			int len = allIndex.size();
			ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
			Iterator<ICFBamIndexObj> valIter = allIndex.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id )
	{
		return( readIndexByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamIndexObj obj = readIndex( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamIndexObj> readIndexByTenantIdx( long TenantId )
	{
		return( readIndexByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamIndexObj> readIndexByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamIndexObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamIndexObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexObj realised = (ICFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
		Iterator<ICFBamIndexObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamIndexObj readIndexByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readIndexByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public ICFBamIndexObj readIndexByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamIndexByUNameIdxKey,
				ICFBamIndexObj >();
		}
		CFBamIndexByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamIndexObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamIndexBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (ICFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamIndexObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamIndexObj> readIndexByIndexTenantIdx( long TenantId )
	{
		return( readIndexByIndexTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamIndexObj> readIndexByIndexTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByIndexTenantIdx";
		CFBamIndexByIndexTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamIndexObj> dict;
		if( indexByIndexTenantIdx == null ) {
			indexByIndexTenantIdx = new HashMap< CFBamIndexByIndexTenantIdxKey,
				Map< CFBamScopePKey, ICFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByIndexTenantIdx.containsKey( key ) ) {
			dict = indexByIndexTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamIndexObj>();
			ICFBamIndexObj obj;
			CFBamIndexBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByIndexTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamIndexBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexObj realised = (ICFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIndexTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
		Iterator<ICFBamIndexObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId )
	{
		return( readIndexByIdxTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<ICFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByIdxTableIdx";
		CFBamIndexByIdxTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<CFBamScopePKey, ICFBamIndexObj> dict;
		if( indexByIdxTableIdx == null ) {
			indexByIdxTableIdx = new HashMap< CFBamIndexByIdxTableIdxKey,
				Map< CFBamScopePKey, ICFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByIdxTableIdx.containsKey( key ) ) {
			dict = indexByIdxTableIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamIndexObj>();
			ICFBamIndexObj obj;
			CFBamIndexBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByIdxTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			CFBamIndexBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexObj realised = (ICFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIdxTableIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
		Iterator<ICFBamIndexObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readIndexByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByDefSchemaIdx";
		CFBamIndexByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamIndexObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamIndexByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamIndexObj>();
			ICFBamIndexObj obj;
			CFBamIndexBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamIndexBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexObj realised = (ICFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
		Iterator<ICFBamIndexObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamIndexObj readCachedIndexByIdIdx( long TenantId,
		long Id )
	{
		ICFBamIndexObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedIndex( pkey );
		return( obj );
	}

	public List<ICFBamIndexObj> readCachedIndexByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedIndexByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamIndexObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
				Iterator<ICFBamIndexObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamIndexObj obj;
			Iterator<ICFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamIndexObj readCachedIndexByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		ICFBamIndexObj obj = null;
		CFBamIndexByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamIndexObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<ICFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public List<ICFBamIndexObj> readCachedIndexByIndexTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedIndexByIndexTenantIdx";
		CFBamIndexByIndexTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>();
		if( indexByIndexTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamIndexObj> dict;
			if( indexByIndexTenantIdx.containsKey( key ) ) {
				dict = indexByIndexTenantIdx.get( key );
				int len = dict.size();
				ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
				Iterator<ICFBamIndexObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamIndexObj obj;
			Iterator<ICFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamIndexObj> readCachedIndexByIdxTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedIndexByIdxTableIdx";
		CFBamIndexByIdxTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>();
		if( indexByIdxTableIdx != null ) {
			Map<CFBamScopePKey, ICFBamIndexObj> dict;
			if( indexByIdxTableIdx.containsKey( key ) ) {
				dict = indexByIdxTableIdx.get( key );
				int len = dict.size();
				ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
				Iterator<ICFBamIndexObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamIndexObj obj;
			Iterator<ICFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamIndexObj> readCachedIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedIndexByDefSchemaIdx";
		CFBamIndexByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamIndexObj> arrayList = new ArrayList<ICFBamIndexObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamIndexObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamIndexObj arr[] = new ICFBamIndexObj[len];
				Iterator<ICFBamIndexObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamIndexObj obj;
			Iterator<ICFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexObj> cmp = new Comparator<ICFBamIndexObj>() {
			public int compare( ICFBamIndexObj lhs, ICFBamIndexObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeIndexByIdIdx( long TenantId,
		long Id )
	{
		ICFBamIndexObj obj = readCachedIndexByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeIndexByTenantIdx";
		ICFBamIndexObj obj;
		List<ICFBamIndexObj> arrayList = readCachedIndexByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		ICFBamIndexObj obj = readCachedIndexByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexByIndexTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeIndexByIndexTenantIdx";
		ICFBamIndexObj obj;
		List<ICFBamIndexObj> arrayList = readCachedIndexByIndexTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexByIdxTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeIndexByIdxTableIdx";
		ICFBamIndexObj obj;
		List<ICFBamIndexObj> arrayList = readCachedIndexByIdxTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeIndexByDefSchemaIdx";
		ICFBamIndexObj obj;
		List<ICFBamIndexObj> arrayList = readCachedIndexByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamIndexObj updateIndex( ICFBamIndexObj Obj ) {
		ICFBamIndexObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableIndex().updateIndex( schema.getAuthorization(),
			Obj.getIndexBuff() );
		if( Obj.getClassCode().equals( "a821" ) ) {
			obj = (ICFBamIndexObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteIndex( ICFBamIndexObj Obj ) {
		ICFBamIndexObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndex( schema.getAuthorization(),
			obj.getIndexBuff() );
		Obj.forget();
	}

	public void deleteIndexByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamIndexObj obj = readIndex( pkey );
		if( obj != null ) {
			ICFBamIndexEditObj editObj = (ICFBamIndexEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamIndexEditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposeIndexByIdIdx( TenantId,
				Id );
	}

	public void deleteIndexByTenantIdx( long TenantId )
	{
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamIndexObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamIndexObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamIndexObj> iter = dict.values().iterator();
			ICFBamIndexObj obj;
			List<ICFBamIndexObj> toForget = new LinkedList<ICFBamIndexObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeIndexByTenantIdx( TenantId );
	}

	public void deleteIndexByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamIndexByUNameIdxKey,
				ICFBamIndexObj >();
		}
		CFBamIndexByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamIndexObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
		}
		deepDisposeIndexByUNameIdx( TenantId,
				TableId,
				Name );
	}

	public void deleteIndexByIndexTenantIdx( long TenantId )
	{
		CFBamIndexByIndexTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByIndexTenantIdx == null ) {
			indexByIndexTenantIdx = new HashMap< CFBamIndexByIndexTenantIdxKey,
				Map< CFBamScopePKey, ICFBamIndexObj > >();
		}
		if( indexByIndexTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamIndexObj> dict = indexByIndexTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByIndexTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamIndexObj> iter = dict.values().iterator();
			ICFBamIndexObj obj;
			List<ICFBamIndexObj> toForget = new LinkedList<ICFBamIndexObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIndexTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByIndexTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeIndexByIndexTenantIdx( TenantId );
	}

	public void deleteIndexByIdxTableIdx( long TenantId,
		long TableId )
	{
		CFBamIndexByIdxTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByIdxTableIdx == null ) {
			indexByIdxTableIdx = new HashMap< CFBamIndexByIdxTableIdxKey,
				Map< CFBamScopePKey, ICFBamIndexObj > >();
		}
		if( indexByIdxTableIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamIndexObj> dict = indexByIdxTableIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByIdxTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<ICFBamIndexObj> iter = dict.values().iterator();
			ICFBamIndexObj obj;
			List<ICFBamIndexObj> toForget = new LinkedList<ICFBamIndexObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIdxTableIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByIdxTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeIndexByIdxTableIdx( TenantId,
				TableId );
	}

	public void deleteIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamIndexByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamIndexByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamIndexObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamIndexObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamIndexObj> iter = dict.values().iterator();
			ICFBamIndexObj obj;
			List<ICFBamIndexObj> toForget = new LinkedList<ICFBamIndexObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefSchemaIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeIndexByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}
}