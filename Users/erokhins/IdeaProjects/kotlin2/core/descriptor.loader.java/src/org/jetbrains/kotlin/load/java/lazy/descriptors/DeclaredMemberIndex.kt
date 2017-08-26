'listOf' @ [34:54] ==> @InlineOnly public inline fun <T> listOf(): List<JavaMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'emptySet' @ [35:41] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'emptySet' @ [38:40] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'invoke' @ [48:9] ==> public abstract operator fun invoke(p1: JavaMember): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'm' @ [48:22] ==> value-parameter m: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex.methodFilter.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [48:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isObjectMethodInInterface' @ [48:53] ==> public open fun isObjectMethodInInterface(@NotNull member: JavaMember): Boolean defined in org.jetbrains.kotlin.load.java.components.DescriptorResolverUtils[JavaMethodDescriptor]

'm' @ [48:79] ==> value-parameter m: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex.methodFilter.<anonymous>[ValueParameterDescriptorImpl]

'jClass' @ [51:27] ==> public final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'methods' @ [51:34] ==> public abstract val methods: Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'asSequence' @ [51:42] ==> public fun <T> Iterable<JavaMethod>.asSequence(): Sequence<JavaMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'filter' @ [51:55] ==> public fun <T> Sequence<JavaMethod>.filter(predicate: (JavaMethod) -> Boolean): Sequence<JavaMethod> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'methodFilter' @ [51:62] ==> private final val methodFilter: (JavaMethod) -> Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'groupBy' @ [51:76] ==> public inline fun <T, K> Sequence<JavaMethod>.groupBy(keySelector: (JavaMethod) -> Name): Map<Name, List<JavaMethod>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod
    <K> -> Name

'm' @ [51:91] ==> value-parameter m: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex.methods.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [51:93] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'jClass' @ [52:26] ==> public final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'fields' @ [52:33] ==> public abstract val fields: Collection<JavaField> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'asSequence' @ [52:40] ==> public fun <T> Iterable<JavaField>.asSequence(): Sequence<JavaField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaField

'filter' @ [52:53] ==> public fun <T> Sequence<JavaField>.filter(predicate: (JavaField) -> Boolean): Sequence<JavaField> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaField

'memberFilter' @ [52:60] ==> private final val memberFilter: (JavaMember) -> Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'associateBy' @ [52:74] ==> public inline fun <T, K> Sequence<JavaField>.associateBy(keySelector: (JavaField) -> Name): Map<Name, JavaField> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaField
    <K> -> Name

'm' @ [52:93] ==> value-parameter m: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex.fields.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [52:95] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'methods' @ [54:74] ==> private final val methods: Map<Name, List<JavaMethod>> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'name' @ [54:82] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex.findMethodsByName[ValueParameterDescriptorImpl]

'listOf' @ [54:91] ==> @InlineOnly public inline fun <T> listOf(): List<JavaMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'jClass' @ [55:48] ==> public final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'methods' @ [55:55] ==> public abstract val methods: Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'asSequence' @ [55:63] ==> public fun <T> Iterable<JavaMethod>.asSequence(): Sequence<JavaMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'filter' @ [55:76] ==> public fun <T> Sequence<JavaMethod>.filter(predicate: (JavaMethod) -> Boolean): Sequence<JavaMethod> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'methodFilter' @ [55:83] ==> private final val methodFilter: (JavaMethod) -> Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'mapTo' @ [55:97] ==> public inline fun <T, R, C : MutableCollection<in Name>> Sequence<JavaMethod>.mapTo(destination: MutableSet<Name>, transform: (JavaMethod) -> Name): MutableSet<Name> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod
    <R> -> Name
    <C : MutableCollection<in R>> -> MutableSet<Name>

'mutableSetOf' @ [55:103] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'name' @ [55:131] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'fields' @ [57:60] ==> private final val fields: Map<Name, JavaField> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'name' @ [57:67] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex.findFieldByName[ValueParameterDescriptorImpl]

'jClass' @ [58:47] ==> public final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'fields' @ [58:54] ==> public abstract val fields: Collection<JavaField> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'asSequence' @ [58:61] ==> public fun <T> Iterable<JavaField>.asSequence(): Sequence<JavaField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaField

'filter' @ [58:74] ==> public fun <T> Sequence<JavaField>.filter(predicate: (JavaField) -> Boolean): Sequence<JavaField> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaField

'memberFilter' @ [58:81] ==> private final val memberFilter: (JavaMember) -> Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[PropertyDescriptorImpl]

'mapTo' @ [58:95] ==> public inline fun <T, R, C : MutableCollection<in Name>> Sequence<JavaField>.mapTo(destination: MutableSet<Name>, transform: (JavaField) -> Name): MutableSet<Name> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaField
    <R> -> Name
    <C : MutableCollection<in R>> -> MutableSet<Name>

'mutableSetOf' @ [58:101] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'name' @ [58:128] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

