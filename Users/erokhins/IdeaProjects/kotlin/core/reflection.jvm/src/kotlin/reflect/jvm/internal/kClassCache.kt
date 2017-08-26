'empty' @ [27:38] ==> @SuppressWarnings @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> empty(): HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal.pcollections.HashPMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Any

'jClass' @ [31:16] ==> value-parameter jClass: Class<T> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[ValueParameterDescriptorImpl]

'name' @ [31:23] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'K_CLASS_CACHE' @ [32:18] ==> private var K_CLASS_CACHE: HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal in file kClassCache.kt[PropertyDescriptorImpl]

'name' @ [32:32] ==> val name: (String..String?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'if (cached is WeakReference<*>) {
        @Suppress("UNCHECKED_CAST")
        val kClass = cached.get() as KClassImpl<T>?
        if (kClass?.jClass == jClass) {
            return kClass
        }
    }
    else if (cached != null) {
        // If the cached value is not a weak reference, it's an array of weak references
        @Suppress("UNCHECKED_CAST")
        (cached as Array<WeakReference<KClassImpl<T>>>)
        for (ref in cached) {
            val kClass = ref.get()
            if (kClass?.jClass == jClass) {
                return kClass
            }
        }

        // This is the most unlikely case: we found a cached array of references of length at least 2 (can't be 1 because
        // the single element would be cached instead), and none of those classes is the one we're looking for
        val size = cached.size
        val newArray = arrayOfNulls<WeakReference<KClassImpl<*>>>(size + 1)
        // Don't use Arrays.copyOf because it works reflectively
        System.arraycopy(cached, 0, newArray, 0, size)
        val newKClass = KClassImpl(jClass)
        newArray[size] = WeakReference(newKClass)
        K_CLASS_CACHE = K_CLASS_CACHE.plus(name, newArray)
        return newKClass
    }' @ [33:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'cached' @ [33:9] ==> val cached: (Any..Any?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'Suppress' @ [34:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'cached' @ [35:22] ==> val cached: (Any..Any?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'get' @ [35:29] ==> public open fun get(): Any? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'kClass' @ [36:13] ==> val kClass: KClassImpl<T>? defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'jClass' @ [36:21] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'jClass' @ [36:31] ==> value-parameter jClass: Class<T> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[ValueParameterDescriptorImpl]

'kClass' @ [37:20] ==> val kClass: KClassImpl<T>? defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'cached' @ [40:14] ==> val cached: (Any..Any?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'Suppress' @ [42:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'cached' @ [43:10] ==> val cached: (Any..Any?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'cached' @ [44:21] ==> val cached: (Any..Any?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'ref' @ [45:26] ==> val ref: WeakReference<KClassImpl<T>> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'get' @ [45:30] ==> public open fun get(): KClassImpl<T>? defined in java.lang.ref.WeakReference[JavaMethodDescriptor]

'kClass' @ [46:17] ==> val kClass: KClassImpl<T>? defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'jClass' @ [46:25] ==> public open val jClass: Class<T> defined in kotlin.reflect.jvm.internal.KClassImpl[PropertyDescriptorImpl]

'jClass' @ [46:35] ==> value-parameter jClass: Class<T> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[ValueParameterDescriptorImpl]

'kClass' @ [47:24] ==> val kClass: KClassImpl<T>? defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'cached' @ [53:20] ==> val cached: (Any..Any?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'size' @ [53:27] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'arrayOfNulls' @ [54:24] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<WeakReference<KClassImpl<*>>?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> WeakReference<KClassImpl<*>>

'size' @ [54:67] ==> val size: Int defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'arraycopy' @ [56:16] ==> public open fun arraycopy(p0: (Any..Any?), p1: Int, p2: (Any..Any?), p3: Int, p4: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'cached' @ [56:26] ==> val cached: (Any..Any?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'newArray' @ [56:37] ==> val newArray: Array<WeakReference<KClassImpl<*>>?> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'size' @ [56:50] ==> val size: Int defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'KClassImpl' @ [57:25] ==> public constructor KClassImpl<T : Any>(jClass: Class<T>) defined in kotlin.reflect.jvm.internal.KClassImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'jClass' @ [57:36] ==> value-parameter jClass: Class<T> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[ValueParameterDescriptorImpl]

'newArray' @ [58:9] ==> val newArray: Array<WeakReference<KClassImpl<*>>?> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'size' @ [58:18] ==> val size: Int defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'WeakReference' @ [58:26] ==> public constructor WeakReference<T : (Any..Any?)>(p0: (KClassImpl<*>..KClassImpl<*>?)) defined in java.lang.ref.WeakReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KClassImpl<T>

'newKClass' @ [58:40] ==> val newKClass: KClassImpl<T> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'K_CLASS_CACHE' @ [59:9] ==> private var K_CLASS_CACHE: HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal in file kClassCache.kt[PropertyDescriptorImpl]

'K_CLASS_CACHE' @ [59:25] ==> private var K_CLASS_CACHE: HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal in file kClassCache.kt[PropertyDescriptorImpl]

'plus' @ [59:39] ==> @NotNull public open fun plus(key: (String..String?), value: (Any..Any?)): HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal.pcollections.HashPMap[JavaMethodDescriptor]

'name' @ [59:44] ==> val name: (String..String?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'newArray' @ [59:50] ==> val newArray: Array<WeakReference<KClassImpl<*>>?> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'newKClass' @ [60:16] ==> val newKClass: KClassImpl<T> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'KClassImpl' @ [63:21] ==> public constructor KClassImpl<T : Any>(jClass: Class<T>) defined in kotlin.reflect.jvm.internal.KClassImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'jClass' @ [63:32] ==> value-parameter jClass: Class<T> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[ValueParameterDescriptorImpl]

'K_CLASS_CACHE' @ [64:5] ==> private var K_CLASS_CACHE: HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal in file kClassCache.kt[PropertyDescriptorImpl]

'K_CLASS_CACHE' @ [64:21] ==> private var K_CLASS_CACHE: HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal in file kClassCache.kt[PropertyDescriptorImpl]

'plus' @ [64:35] ==> @NotNull public open fun plus(key: (String..String?), value: (Any..Any?)): HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal.pcollections.HashPMap[JavaMethodDescriptor]

'name' @ [64:40] ==> val name: (String..String?) defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'WeakReference' @ [64:46] ==> public constructor WeakReference<T : (Any..Any?)>(p0: (KClassImpl<T>..KClassImpl<T>?)) defined in java.lang.ref.WeakReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KClassImpl<T>

'newKClass' @ [64:60] ==> val newKClass: KClassImpl<T> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'newKClass' @ [65:12] ==> val newKClass: KClassImpl<T> defined in kotlin.reflect.jvm.internal.getOrCreateKotlinClass[LocalVariableDescriptor]

'K_CLASS_CACHE' @ [69:5] ==> private var K_CLASS_CACHE: HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal in file kClassCache.kt[PropertyDescriptorImpl]

'empty' @ [69:30] ==> @SuppressWarnings @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> empty(): HashPMap<(String..String?), (Any..Any?)> defined in kotlin.reflect.jvm.internal.pcollections.HashPMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Any

