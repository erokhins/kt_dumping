'this' @ [38:55] ==> private constructor ClassifierResolutionContext(classesByQName: ClassIdToJavaClass /* = (ClassId) -> JavaClass? */, typeParameters: MutableMap<String, JavaTypeParameter>?, innerClasses: MutableMap<String, ClassifierResolutionContext.InnerClassInfo>?) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[ClassConstructorDescriptorImpl]

'classesByQName' @ [38:60] ==> value-parameter classesByQName: ClassIdToJavaClass /* = (ClassId) -> JavaClass? */ defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.<init>[ValueParameterDescriptorImpl]

'innerClasses' @ [45:13] ==> private final var innerClasses: MutableMap<String, ClassifierResolutionContext.InnerClassInfo>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'innerClasses' @ [46:13] ==> private final var innerClasses: MutableMap<String, ClassifierResolutionContext.InnerClassInfo>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'THashMap' @ [46:28] ==> public constructor THashMap<K : (Any..Any?), V : (Any..Any?)>() defined in gnu.trove.THashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo..org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo?)

'innerClasses' @ [49:9] ==> private final var innerClasses: MutableMap<String, ClassifierResolutionContext.InnerClassInfo>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'put' @ [49:24] ==> public abstract fun put(key: String, value: ClassifierResolutionContext.InnerClassInfo): ClassifierResolutionContext.InnerClassInfo? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'innerInternalName' @ [49:28] ==> value-parameter innerInternalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.addInnerClass[ValueParameterDescriptorImpl]

'InnerClassInfo' @ [49:47] ==> public constructor InnerClassInfo(outerInternalName: String, simpleName: String) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo[ClassConstructorDescriptorImpl]

'outerInternalName' @ [49:62] ==> value-parameter outerInternalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.addInnerClass[ValueParameterDescriptorImpl]

'simpleName' @ [49:81] ==> value-parameter simpleName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.addInnerClass[ValueParameterDescriptorImpl]

'newTypeParameters' @ [53:13] ==> value-parameter newTypeParameters: Collection<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.addTypeParameters[ValueParameterDescriptorImpl]

'isEmpty' @ [53:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'typeParameters' @ [54:13] ==> private final var typeParameters: MutableMap<String, JavaTypeParameter>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'typeParameters' @ [55:13] ==> private final var typeParameters: MutableMap<String, JavaTypeParameter>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'THashMap' @ [55:30] ==> public constructor THashMap<K : (Any..Any?), V : (Any..Any?)>() defined in gnu.trove.THashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.load.java.structure.JavaTypeParameter..org.jetbrains.kotlin.load.java.structure.JavaTypeParameter?)

'newTypeParameters' @ [58:9] ==> value-parameter newTypeParameters: Collection<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.addTypeParameters[ValueParameterDescriptorImpl]

'associateByTo' @ [58:27] ==> public inline fun <T, K, M : MutableMap<in String, in JavaTypeParameter>> Iterable<JavaTypeParameter>.associateByTo(destination: MutableMap<String, JavaTypeParameter>, keySelector: (JavaTypeParameter) -> String): MutableMap<String, JavaTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeParameter
    <K> -> String
    <M : MutableMap<in K, in T>> -> MutableMap<String, JavaTypeParameter>

'typeParameters' @ [58:41] ==> private final var typeParameters: MutableMap<String, JavaTypeParameter>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'it' @ [58:61] ==> value-parameter it: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.addTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [58:64] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaTypeParameter[DeserializedPropertyDescriptor]

'identifier' @ [58:69] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'Result' @ [61:51] ==> public constructor Result(classifier: JavaClassifier?, qualifiedName: String) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.Result[ClassConstructorDescriptorImpl]

'invoke' @ [61:58] ==> public abstract operator fun invoke(p1: ClassId): JavaClass? defined in kotlin.Function1[FunctionInvokeDescriptor]

'classId' @ [61:73] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.resolveClass[ValueParameterDescriptorImpl]

'classId' @ [61:83] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.resolveClass[ValueParameterDescriptorImpl]

'asSingleFqName' @ [61:91] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'asString' @ [61:108] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'Result' @ [62:55] ==> public constructor Result(classifier: JavaClassifier?, qualifiedName: String) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.Result[ClassConstructorDescriptorImpl]

'typeParameters' @ [62:62] ==> private final var typeParameters: MutableMap<String, JavaTypeParameter>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'get' @ [62:78] ==> public abstract fun get(key: String): JavaTypeParameter? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'name' @ [62:82] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.resolveTypeParameter[ValueParameterDescriptorImpl]

'name' @ [62:89] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.resolveTypeParameter[ValueParameterDescriptorImpl]

'ClassifierResolutionContext' @ [65:13] ==> private constructor ClassifierResolutionContext(classesByQName: ClassIdToJavaClass /* = (ClassId) -> JavaClass? */, typeParameters: MutableMap<String, JavaTypeParameter>?, innerClasses: MutableMap<String, ClassifierResolutionContext.InnerClassInfo>?) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[ClassConstructorDescriptorImpl]

'classesByQName' @ [65:41] ==> private final val classesByQName: ClassIdToJavaClass /* = (ClassId) -> JavaClass? */ defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'typeParameters' @ [65:57] ==> private final var typeParameters: MutableMap<String, JavaTypeParameter>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'let' @ [65:73] ==> @InlineOnly public inline fun <T, R> MutableMap<String, JavaTypeParameter>.let(block: (MutableMap<String, JavaTypeParameter>) -> THashMap<(String..String?), (JavaTypeParameter..JavaTypeParameter?)>): THashMap<(String..String?), (JavaTypeParameter..JavaTypeParameter?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableMap<String, JavaTypeParameter>
    <R> -> THashMap<(kotlin.String..kotlin.String?), (org.jetbrains.kotlin.load.java.structure.JavaTypeParameter..org.jetbrains.kotlin.load.java.structure.JavaTypeParameter?)>

'THashMap' @ [65:79] ==> public constructor THashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<(String..String?), (JavaTypeParameter..JavaTypeParameter?)>..Map<(String..String?), (JavaTypeParameter..JavaTypeParameter?)>?)) defined in gnu.trove.THashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.load.java.structure.JavaTypeParameter..org.jetbrains.kotlin.load.java.structure.JavaTypeParameter?)

'innerClasses' @ [65:90] ==> private final var innerClasses: MutableMap<String, ClassifierResolutionContext.InnerClassInfo>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'let' @ [65:104] ==> @InlineOnly public inline fun <T, R> MutableMap<String, ClassifierResolutionContext.InnerClassInfo>.let(block: (MutableMap<String, ClassifierResolutionContext.InnerClassInfo>) -> THashMap<(String..String?), (ClassifierResolutionContext.InnerClassInfo..ClassifierResolutionContext.InnerClassInfo?)>): THashMap<(String..String?), (ClassifierResolutionContext.InnerClassInfo..ClassifierResolutionContext.InnerClassInfo?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableMap<String, InnerClassInfo>
    <R> -> THashMap<(kotlin.String..kotlin.String?), (org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo..org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo?)>

'THashMap' @ [65:110] ==> public constructor THashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<(String..String?), (ClassifierResolutionContext.InnerClassInfo..ClassifierResolutionContext.InnerClassInfo?)>..Map<(String..String?), (ClassifierResolutionContext.InnerClassInfo..ClassifierResolutionContext.InnerClassInfo?)>?)) defined in gnu.trove.THashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo..org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo?)

'in' @ [69:13] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'internalName' @ [69:20] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[ValueParameterDescriptorImpl]

'internalName' @ [70:25] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[ValueParameterDescriptorImpl]

'split' @ [70:38] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mapInternalNameToClassId' @ [72:30] ==> internal final fun mapInternalNameToClassId(internalName: String): ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[SimpleFunctionDescriptorImpl]

'parts' @ [72:55] ==> val parts: List<String> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[LocalVariableDescriptor]

'parts' @ [73:31] ==> val parts: List<String> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[LocalVariableDescriptor]

'subList' @ [73:37] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<String> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'parts' @ [73:48] ==> val parts: List<String> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[LocalVariableDescriptor]

'size' @ [73:54] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'nestedParts' @ [75:20] ==> val nestedParts: List<String> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[LocalVariableDescriptor]

'fold' @ [75:32] ==> public inline fun <T, R> Iterable<String>.fold(initial: ClassId, operation: (acc: ClassId, String) -> ClassId): ClassId defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> ClassId

'outerClass' @ [75:37] ==> val outerClass: ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[LocalVariableDescriptor]

'classId' @ [76:17] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId.<anonymous>[ValueParameterDescriptorImpl]

'createNestedClassId' @ [76:25] ==> @NotNull public open fun createNestedClassId(@NotNull p0: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'identifier' @ [76:50] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'part' @ [76:61] ==> value-parameter part: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId.<anonymous>[ValueParameterDescriptorImpl]

'in' @ [80:13] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'internalName' @ [80:20] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[ValueParameterDescriptorImpl]

'innerClasses' @ [81:34] ==> private final var innerClasses: MutableMap<String, ClassifierResolutionContext.InnerClassInfo>? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[PropertyDescriptorImpl]

'get' @ [81:48] ==> public abstract fun get(key: String): ClassifierResolutionContext.InnerClassInfo? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'internalName' @ [81:52] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[ValueParameterDescriptorImpl]

'mapInternalNameToClassIdNaively' @ [81:76] ==> private final fun mapInternalNameToClassIdNaively(internalName: String): ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[SimpleFunctionDescriptorImpl]

'internalName' @ [81:108] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[ValueParameterDescriptorImpl]

'isValidIdentifier' @ [82:22] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'innerClassInfo' @ [82:40] ==> val innerClassInfo: ClassifierResolutionContext.InnerClassInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[LocalVariableDescriptor]

'simpleName' @ [82:55] ==> public final val simpleName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo[PropertyDescriptorImpl]

'mapInternalNameToClassId' @ [83:36] ==> internal final fun mapInternalNameToClassId(internalName: String): ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[SimpleFunctionDescriptorImpl]

'innerClassInfo' @ [83:61] ==> val innerClassInfo: ClassifierResolutionContext.InnerClassInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[LocalVariableDescriptor]

'outerInternalName' @ [83:76] ==> public final val outerInternalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo[PropertyDescriptorImpl]

'outerClassId' @ [84:24] ==> val outerClassId: ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[LocalVariableDescriptor]

'createNestedClassId' @ [84:37] ==> @NotNull public open fun createNestedClassId(@NotNull p0: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'identifier' @ [84:62] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'innerClassInfo' @ [84:73] ==> val innerClassInfo: ClassifierResolutionContext.InnerClassInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[LocalVariableDescriptor]

'simpleName' @ [84:88] ==> public final val simpleName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.InnerClassInfo[PropertyDescriptorImpl]

'createClassIdForTopLevel' @ [88:16] ==> private final fun createClassIdForTopLevel(internalName: String): ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[SimpleFunctionDescriptorImpl]

'internalName' @ [88:41] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassId[ValueParameterDescriptorImpl]

'newSmartList' @ [93:41] ==> @NotNull @Contract public open fun <T : (Any..Any?)> newSmartList(): (MutableList<(Int..Int?)>..List<(Int..Int?)>) defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Int

'..' @ [94:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'internalName' @ [94:22] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[ValueParameterDescriptorImpl]

'length' @ [94:35] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'internalName' @ [95:21] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[ValueParameterDescriptorImpl]

'p' @ [95:34] ==> val p: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'c' @ [96:17] ==> val c: Char defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'p' @ [96:29] ==> val p: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'internalName' @ [96:38] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[ValueParameterDescriptorImpl]

'p' @ [96:51] ==> val p: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'p' @ [96:68] ==> val p: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'internalName' @ [96:72] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[ValueParameterDescriptorImpl]

'length' @ [96:85] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'internalName' @ [96:99] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[ValueParameterDescriptorImpl]

'p' @ [96:112] ==> val p: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'splitPoints' @ [97:17] ==> val splitPoints: (MutableList<(Int..Int?)>..List<(Int..Int?)>) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'add' @ [97:29] ==> public abstract fun add(element: (Int..Int?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'p' @ [97:33] ==> val p: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'splitPoints' @ [101:13] ==> val splitPoints: (MutableList<(Int..Int?)>..List<(Int..Int?)>) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'isNotEmpty' @ [101:25] ==> @InlineOnly public inline fun <T> Collection<(Int..Int?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'listOf' @ [102:31] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'-' @ [102:38] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'splitPoints' @ [102:44] ==> val splitPoints: (MutableList<(Int..Int?)>..List<(Int..Int?)>) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'zip' @ [102:57] ==> public infix fun <T, R> Iterable<(Int..Int?)>.zip(other: Iterable<(Int..Int?)>): List<Pair<(Int..Int?), (Int..Int?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)
    <R> -> (kotlin.Int..kotlin.Int?)

'splitPoints' @ [102:61] ==> val splitPoints: (MutableList<(Int..Int?)>..List<(Int..Int?)>) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'internalName' @ [102:75] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[ValueParameterDescriptorImpl]

'length' @ [102:88] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'map' @ [102:96] ==> public inline fun <T, R> Iterable<Pair<(Int..Int?), (Int..Int?)>>.map(transform: (Pair<(Int..Int?), (Int..Int?)>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(kotlin.Int..kotlin.Int?), (kotlin.Int..kotlin.Int?)>
    <R> -> String

'component1' @ [102:103] ==> public final operator fun component1(): (Int..Int?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [102:109] ==> public final operator fun component2(): (Int..Int?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'internalName' @ [103:17] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[ValueParameterDescriptorImpl]

'substring' @ [103:30] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'from' @ [103:40] ==> val from: (Int..Int?) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively.<anonymous>[LocalVariableDescriptor]

'to' @ [103:50] ==> val to: (Int..Int?) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively.<anonymous>[LocalVariableDescriptor]

'FqName' @ [106:31] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'substrings' @ [106:38] ==> val substrings: List<String> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'replace' @ [106:52] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'outerFqName' @ [107:33] ==> val outerFqName: FqName defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'parent' @ [107:45] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'FqName' @ [109:21] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'outerFqName' @ [109:28] ==> val outerFqName: FqName defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'shortName' @ [109:40] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [109:52] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'substrings' @ [109:72] ==> val substrings: List<String> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'subList' @ [109:83] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<String> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'substrings' @ [109:94] ==> val substrings: List<String> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'size' @ [109:105] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'joinToString' @ [109:111] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ClassId' @ [111:20] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: FqName, p2: Boolean) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'packageFqName' @ [111:28] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'relativeName' @ [111:43] ==> val relativeName: FqName defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[LocalVariableDescriptor]

'createClassIdForTopLevel' @ [114:16] ==> private final fun createClassIdForTopLevel(internalName: String): ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[SimpleFunctionDescriptorImpl]

'internalName' @ [114:41] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.mapInternalNameToClassIdNaively[ValueParameterDescriptorImpl]

'topLevel' @ [117:74] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FqName' @ [117:83] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'internalName' @ [117:90] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.createClassIdForTopLevel[ValueParameterDescriptorImpl]

'replace' @ [117:103] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resolveClass' @ [119:53] ==> internal final fun resolveClass(classId: ClassId): ClassifierResolutionContext.Result defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[SimpleFunctionDescriptorImpl]

'mapInternalNameToClassId' @ [119:66] ==> internal final fun mapInternalNameToClassId(internalName: String): ClassId defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[SimpleFunctionDescriptorImpl]

'c' @ [119:91] ==> value-parameter c: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext.resolveByInternalName[ValueParameterDescriptorImpl]

