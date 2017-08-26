'MultiMap' @ [24:31] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Type
    <V : (Any..Any?)> -> ComponentDescriptor

'descriptors' @ [25:28] ==> value-parameter descriptors: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.buildRegistrationMap[ValueParameterDescriptorImpl]

'descriptor' @ [26:34] ==> val descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentRegistry.buildRegistrationMap[LocalVariableDescriptor]

'getRegistrations' @ [26:45] ==> public abstract fun getRegistrations(): Iterable<Type> defined in org.jetbrains.kotlin.container.ComponentDescriptor[SimpleFunctionDescriptorImpl]

'registrationMap' @ [27:17] ==> val registrationMap: MultiMap<Type, ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.buildRegistrationMap[LocalVariableDescriptor]

'putValue' @ [27:33] ==> public open fun putValue(@Nullable p0: Type?, p1: (ComponentDescriptor..ComponentDescriptor?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'registration' @ [27:42] ==> val registration: Type defined in org.jetbrains.kotlin.container.ComponentRegistry.buildRegistrationMap[LocalVariableDescriptor]

'descriptor' @ [27:56] ==> val descriptor: ComponentDescriptor defined in org.jetbrains.kotlin.container.ComponentRegistry.buildRegistrationMap[LocalVariableDescriptor]

'registrationMap' @ [30:16] ==> val registrationMap: MultiMap<Type, ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.buildRegistrationMap[LocalVariableDescriptor]

'hashMapOf' @ [33:35] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Type, Any> /* = HashMap<Type, Any> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Type
    <V> -> Any

'buildRegistrationMap' @ [36:34] ==> public final fun buildRegistrationMap(descriptors: Collection<ComponentDescriptor>): MultiMap<Type, ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry[SimpleFunctionDescriptorImpl]

'descriptors' @ [36:55] ==> value-parameter descriptors: Collection<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[ValueParameterDescriptorImpl]

'newRegistrationMap' @ [37:23] ==> val newRegistrationMap: MultiMap<Type, ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'entrySet' @ [37:42] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>..Map.Entry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>?)>..Set<(MutableMap.MutableEntry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>..Map.Entry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'registrationMap' @ [38:30] ==> private final val registrationMap: HashMap<Type, Any> /* = HashMap<Type, Any> */ defined in org.jetbrains.kotlin.container.ComponentRegistry[PropertyDescriptorImpl]

'entry' @ [38:46] ==> val entry: (MutableMap.MutableEntry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>..Map.Entry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>?) defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'key' @ [38:52] ==> public abstract val key: (Type..Type?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'if (oldEntries != null || entry.value.size > 1) {
                val list = mutableListOf<ComponentDescriptor>()
                if (oldEntries is Collection<*>) {
                    @Suppress("UNCHECKED_CAST")
                    list.addAll(oldEntries as Collection<ComponentDescriptor>)
                }
                else if (oldEntries != null) {
                    list.add(oldEntries as ComponentDescriptor)
                }
                list.addAll(entry.value)
                registrationMap[entry.key] = list.singleOrNull() ?: list
            }
            else {
                registrationMap[entry.key] = entry.value.single()
            }' @ [39:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'oldEntries' @ [39:17] ==> val oldEntries: Any? defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'entry' @ [39:39] ==> val entry: (MutableMap.MutableEntry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>..Map.Entry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>?) defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'value' @ [39:45] ==> public abstract val value: (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'size' @ [39:51] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'mutableListOf' @ [40:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<ComponentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComponentDescriptor

'if (oldEntries is Collection<*>) {
                    @Suppress("UNCHECKED_CAST")
                    list.addAll(oldEntries as Collection<ComponentDescriptor>)
                }
                else if (oldEntries != null) {
                    list.add(oldEntries as ComponentDescriptor)
                }' @ [41:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'oldEntries' @ [41:21] ==> val oldEntries: Any? defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'Suppress' @ [42:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'list' @ [43:21] ==> val list: MutableList<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'addAll' @ [43:26] ==> public abstract fun addAll(elements: Collection<ComponentDescriptor>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'oldEntries' @ [43:33] ==> val oldEntries: Any? defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'oldEntries' @ [45:26] ==> val oldEntries: Any? defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'list' @ [46:21] ==> val list: MutableList<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'add' @ [46:26] ==> public abstract fun add(element: ComponentDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'oldEntries' @ [46:30] ==> val oldEntries: Any? defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'list' @ [48:17] ==> val list: MutableList<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'addAll' @ [48:22] ==> public abstract fun addAll(elements: Collection<ComponentDescriptor>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'entry' @ [48:29] ==> val entry: (MutableMap.MutableEntry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>..Map.Entry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>?) defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'value' @ [48:35] ==> public abstract val value: (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'registrationMap' @ [49:17] ==> private final val registrationMap: HashMap<Type, Any> /* = HashMap<Type, Any> */ defined in org.jetbrains.kotlin.container.ComponentRegistry[PropertyDescriptorImpl]

'entry' @ [49:33] ==> val entry: (MutableMap.MutableEntry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>..Map.Entry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>?) defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'key' @ [49:39] ==> public abstract val key: (Type..Type?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'list' @ [49:46] ==> val list: MutableList<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'singleOrNull' @ [49:51] ==> public fun <T> List<ComponentDescriptor>.singleOrNull(): ComponentDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComponentDescriptor

'list' @ [49:69] ==> val list: MutableList<ComponentDescriptor> defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'registrationMap' @ [52:17] ==> private final val registrationMap: HashMap<Type, Any> /* = HashMap<Type, Any> */ defined in org.jetbrains.kotlin.container.ComponentRegistry[PropertyDescriptorImpl]

'entry' @ [52:33] ==> val entry: (MutableMap.MutableEntry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>..Map.Entry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>?) defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'key' @ [52:39] ==> public abstract val key: (Type..Type?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'entry' @ [52:46] ==> val entry: (MutableMap.MutableEntry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>..Map.Entry<(Type..Type?), (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?)>?) defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[LocalVariableDescriptor]

'value' @ [52:52] ==> public abstract val value: (MutableCollection<(ComponentDescriptor..ComponentDescriptor?)>..Collection<(ComponentDescriptor..ComponentDescriptor?)>?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'single' @ [52:58] ==> public fun <T> Iterable<(ComponentDescriptor..ComponentDescriptor?)>.single(): (ComponentDescriptor..ComponentDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.container.ComponentDescriptor..org.jetbrains.kotlin.container.ComponentDescriptor?)

'registrationMap' @ [58:21] ==> private final val registrationMap: HashMap<Type, Any> /* = HashMap<Type, Any> */ defined in org.jetbrains.kotlin.container.ComponentRegistry[PropertyDescriptorImpl]

'request' @ [58:37] ==> value-parameter request: Type defined in org.jetbrains.kotlin.container.ComponentRegistry.tryGetEntry[ValueParameterDescriptorImpl]

'Suppress' @ [59:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when(value) {
            is Collection<*> -> value as Collection<ComponentDescriptor>
            null -> emptyList()
            else -> listOf(value as ComponentDescriptor)
        }' @ [60:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<ComponentDescriptor>, entry1: Collection<ComponentDescriptor>, entry2: Collection<ComponentDescriptor>): Collection<ComponentDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<ComponentDescriptor>

'value' @ [60:21] ==> val value: Any? defined in org.jetbrains.kotlin.container.ComponentRegistry.tryGetEntry[LocalVariableDescriptor]

'value' @ [61:33] ==> val value: Any? defined in org.jetbrains.kotlin.container.ComponentRegistry.tryGetEntry[LocalVariableDescriptor]

'emptyList' @ [62:21] ==> public fun <T> emptyList(): List<ComponentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComponentDescriptor

'listOf' @ [63:21] ==> public fun <T> listOf(element: ComponentDescriptor): List<ComponentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComponentDescriptor

'value' @ [63:28] ==> val value: Any? defined in org.jetbrains.kotlin.container.ComponentRegistry.tryGetEntry[LocalVariableDescriptor]

'!' @ [68:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'registrationMap' @ [68:14] ==> private final val registrationMap: HashMap<Type, Any> /* = HashMap<Type, Any> */ defined in org.jetbrains.kotlin.container.ComponentRegistry[PropertyDescriptorImpl]

'isEmpty' @ [68:30] ==> public open fun isEmpty(): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'IllegalStateException' @ [69:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'registrationMap' @ [71:9] ==> private final val registrationMap: HashMap<Type, Any> /* = HashMap<Type, Any> */ defined in org.jetbrains.kotlin.container.ComponentRegistry[PropertyDescriptorImpl]

'other' @ [71:28] ==> value-parameter other: ComponentRegistry defined in org.jetbrains.kotlin.container.ComponentRegistry.addAll[ValueParameterDescriptorImpl]

'registrationMap' @ [71:34] ==> private final val registrationMap: HashMap<Type, Any> /* = HashMap<Type, Any> */ defined in org.jetbrains.kotlin.container.ComponentRegistry[PropertyDescriptorImpl]

