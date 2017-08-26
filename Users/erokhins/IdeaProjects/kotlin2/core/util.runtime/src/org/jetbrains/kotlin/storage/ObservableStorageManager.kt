'delegate' @ [26:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createMemoizedFunction' @ [26:25] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (K) -> V): MemoizedFunctionToNotNull<K, V> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V : Any> -> V

'compute' @ [26:48] ==> value-parameter compute: (K) -> V defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createMemoizedFunction[ValueParameterDescriptorImpl]

'observable' @ [26:56] ==> protected abstract val <K, V> ((K) -> V).observable: (K) -> V defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'delegate' @ [30:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [30:25] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (K) -> V?): MemoizedFunctionToNullable<K, V> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V : Any> -> V

'compute' @ [30:66] ==> value-parameter compute: (K) -> V? defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createMemoizedFunctionWithNullableValues[ValueParameterDescriptorImpl]

'observable' @ [30:74] ==> protected abstract val <K, V> ((K) -> V?).observable: (K) -> V? defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V?

'delegate' @ [34:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createMemoizedFunction' @ [34:25] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (K) -> V, map: ConcurrentMap<K, Any>): MemoizedFunctionToNotNull<K, V> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V : Any> -> V

'compute' @ [34:48] ==> value-parameter compute: (K) -> V defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createMemoizedFunction[ValueParameterDescriptorImpl]

'observable' @ [34:56] ==> protected abstract val <K, V> ((K) -> V).observable: (K) -> V defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'map' @ [34:68] ==> value-parameter map: ConcurrentMap<K, Any> defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createMemoizedFunction[ValueParameterDescriptorImpl]

'delegate' @ [38:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [38:25] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (K) -> V, map: ConcurrentMap<K, Any>): MemoizedFunctionToNullable<K, V> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V : Any> -> V

'compute' @ [38:66] ==> value-parameter compute: (K) -> V defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createMemoizedFunctionWithNullableValues[ValueParameterDescriptorImpl]

'observable' @ [38:74] ==> protected abstract val <K, V> ((K) -> V).observable: (K) -> V defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'map' @ [38:86] ==> value-parameter map: ConcurrentMap<K, Any> defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createMemoizedFunctionWithNullableValues[ValueParameterDescriptorImpl]

'delegate' @ [42:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createCacheWithNullableValues' @ [42:25] ==> public abstract fun <K, V : Any> createCacheWithNullableValues(): CacheWithNullableValues<K, V> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V : Any> -> V

'delegate' @ [46:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createCacheWithNotNullValues' @ [46:25] ==> public abstract fun <K, V : Any> createCacheWithNotNullValues(): CacheWithNotNullValues<K, V> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V : Any> -> V

'delegate' @ [50:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createLazyValue' @ [50:25] ==> public abstract fun <T : Any> createLazyValue(computable: () -> T): NotNullLazyValue<T> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'computable' @ [50:41] ==> value-parameter computable: () -> T defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createLazyValue[ValueParameterDescriptorImpl]

'observable' @ [50:52] ==> protected abstract val <T> (() -> T).observable: () -> T defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <T> -> T

'delegate' @ [54:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createRecursionTolerantLazyValue' @ [54:25] ==> public abstract fun <T : Any> createRecursionTolerantLazyValue(computable: () -> T, onRecursiveCall: T): NotNullLazyValue<T> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'computable' @ [54:58] ==> value-parameter computable: () -> T defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createRecursionTolerantLazyValue[ValueParameterDescriptorImpl]

'observable' @ [54:69] ==> protected abstract val <T> (() -> T).observable: () -> T defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <T> -> T

'onRecursiveCall' @ [54:81] ==> value-parameter onRecursiveCall: T defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createRecursionTolerantLazyValue[ValueParameterDescriptorImpl]

'delegate' @ [58:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createLazyValueWithPostCompute' @ [58:25] ==> public abstract fun <T : Any> createLazyValueWithPostCompute(computable: () -> T, onRecursiveCall: ((Boolean) -> T)?, postCompute: (T) -> Unit): NotNullLazyValue<T> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'computable' @ [58:56] ==> value-parameter computable: () -> T defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createLazyValueWithPostCompute[ValueParameterDescriptorImpl]

'observable' @ [58:67] ==> protected abstract val <T> (() -> T).observable: () -> T defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <T> -> T

'onRecursiveCall' @ [58:79] ==> value-parameter onRecursiveCall: ((Boolean) -> T)? defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createLazyValueWithPostCompute[ValueParameterDescriptorImpl]

'postCompute' @ [58:96] ==> value-parameter postCompute: (T) -> Unit defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createLazyValueWithPostCompute[ValueParameterDescriptorImpl]

'delegate' @ [62:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createNullableLazyValue' @ [62:25] ==> public abstract fun <T : Any> createNullableLazyValue(computable: () -> T?): NullableLazyValue<T> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'computable' @ [62:49] ==> value-parameter computable: () -> T? defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createNullableLazyValue[ValueParameterDescriptorImpl]

'observable' @ [62:60] ==> protected abstract val <T> (() -> T?).observable: () -> T? defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <T> -> T?

'delegate' @ [66:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createRecursionTolerantNullableLazyValue' @ [66:25] ==> public abstract fun <T : Any> createRecursionTolerantNullableLazyValue(computable: () -> T?, onRecursiveCall: T?): NullableLazyValue<T> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'computable' @ [66:66] ==> value-parameter computable: () -> T? defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createRecursionTolerantNullableLazyValue[ValueParameterDescriptorImpl]

'observable' @ [66:77] ==> protected abstract val <T> (() -> T?).observable: () -> T? defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <T> -> T?

'onRecursiveCall' @ [66:89] ==> value-parameter onRecursiveCall: T? defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createRecursionTolerantNullableLazyValue[ValueParameterDescriptorImpl]

'delegate' @ [70:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'createNullableLazyValueWithPostCompute' @ [70:25] ==> public abstract fun <T : Any> createNullableLazyValueWithPostCompute(computable: () -> T?, postCompute: (T?) -> Unit): NullableLazyValue<T> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'computable' @ [70:64] ==> value-parameter computable: () -> T? defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createNullableLazyValueWithPostCompute[ValueParameterDescriptorImpl]

'observable' @ [70:75] ==> protected abstract val <T> (() -> T?).observable: () -> T? defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <T> -> T?

'postCompute' @ [70:87] ==> value-parameter postCompute: (T?) -> Unit defined in org.jetbrains.kotlin.storage.ObservableStorageManager.createNullableLazyValueWithPostCompute[ValueParameterDescriptorImpl]

'delegate' @ [74:16] ==> private final val delegate: StorageManager defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]

'compute' @ [74:25] ==> public abstract fun <T> compute(computable: () -> T): T defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'computable' @ [74:33] ==> value-parameter computable: () -> T defined in org.jetbrains.kotlin.storage.ObservableStorageManager.compute[ValueParameterDescriptorImpl]

'observable' @ [74:44] ==> protected abstract val <T> (() -> T).observable: () -> T defined in org.jetbrains.kotlin.storage.ObservableStorageManager[PropertyDescriptorImpl]
Inferred types:
    <T> -> T

