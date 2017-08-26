'this' @ [29:54] ==> public constructor SmartMockReferenceTypeContext(outputFiles: List<OutputFile>) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext[ClassConstructorDescriptorImpl]

'outputFiles' @ [29:59] ==> value-parameter outputFiles: OutputFileCollection defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext.<init>[ValueParameterDescriptorImpl]

'asList' @ [29:71] ==> public abstract fun asList(): List<OutputFile> defined in org.jetbrains.kotlin.backend.common.output.OutputFileCollection[DeserializedSimpleFunctionDescriptor]

'MockVirtualMachine' @ [31:26] ==> public constructor MockVirtualMachine() defined in org.jetbrains.kotlin.idea.debugger.MockVirtualMachine[JavaClassConstructorDescriptor]

'outputFiles' @ [33:19] ==> value-parameter outputFiles: List<OutputFile> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext.<init>[ValueParameterDescriptorImpl]

'filter' @ [33:31] ==> public inline fun <T> Iterable<OutputFile>.filter(predicate: (OutputFile) -> Boolean): List<OutputFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile

'it' @ [33:40] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext.classes.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [33:43] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'endsWith' @ [33:56] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [33:77] ==> public inline fun <T, R> Iterable<OutputFile>.map(transform: (OutputFile) -> ClassNode): List<ClassNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile
    <R> -> ClassNode

'ClassNode' @ [34:9] ==> public constructor ClassNode() defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaClassConstructorDescriptor]

'also' @ [34:21] ==> @InlineOnly @SinceKotlin public inline fun <T> ClassNode.also(block: (ClassNode) -> Unit): ClassNode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'ClassReader' @ [34:28] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'file' @ [34:40] ==> value-parameter file: OutputFile defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext.classes.<anonymous>[ValueParameterDescriptorImpl]

'asByteArray' @ [34:45] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'accept' @ [34:60] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'it' @ [34:67] ==> value-parameter it: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext.classes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'EXPAND_FRAMES' @ [34:83] ==> public const final val EXPAND_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'lazy' @ [37:48] ==> public fun <T> lazy(initializer: () -> List<SmartMockReferenceType>): Lazy<List<SmartMockReferenceType>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SmartMockReferenceType>

'classes' @ [37:55] ==> public final val classes: List<ClassNode> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext[PropertyDescriptorImpl]

'map' @ [37:63] ==> public inline fun <T, R> Iterable<ClassNode>.map(transform: (ClassNode) -> SmartMockReferenceType): List<SmartMockReferenceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode
    <R> -> SmartMockReferenceType

'SmartMockReferenceType' @ [37:69] ==> public constructor SmartMockReferenceType(classNode: ClassNode, context: SmartMockReferenceTypeContext) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[ClassConstructorDescriptorImpl]

'it' @ [37:92] ==> value-parameter it: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext.referenceTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [37:96] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext[LazyClassReceiverParameterDescriptor]

'lazy' @ [39:33] ==> public fun <T> lazy(initializer: () -> Map<(String..String?), ReferenceType>): Lazy<Map<(String..String?), ReferenceType>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<(kotlin.String..kotlin.String?), ReferenceType>

'referenceTypes' @ [39:40] ==> public final val referenceTypes: List<ReferenceType> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext[PropertyDescriptorImpl]

'map' @ [39:55] ==> public inline fun <T, R> Iterable<ReferenceType>.map(transform: (ReferenceType) -> Pair<(String..String?), ReferenceType>): List<Pair<(String..String?), ReferenceType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReferenceType
    <R> -> Pair<(kotlin.String..kotlin.String?), ReferenceType>

'Pair' @ [39:61] ==> public constructor Pair<out A, out B>(first: (String..String?), second: ReferenceType) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (kotlin.String..kotlin.String?)
    <out B> -> ReferenceType

'it' @ [39:66] ==> value-parameter it: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext.referenceTypesByName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [39:69] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'it' @ [39:77] ==> value-parameter it: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext.referenceTypesByName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [39:83] ==> public fun <K, V> Iterable<Pair<(String..String?), ReferenceType>>.toMap(): Map<(String..String?), ReferenceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> ReferenceType

'emptyList' @ [43:50] ==> public fun <T> emptyList(): List<ObjectReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObjectReference

'!=' @ [45:31] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classNode' @ [45:32] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [45:42] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_PUBLIC' @ [45:61] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'classNode' @ [49:42] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'sourceFile' @ [49:52] ==> public final var sourceFile: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'TODO' @ [51:29] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [57:32] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'==' @ [59:39] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classNode' @ [59:40] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [59:50] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_PUBLIC' @ [59:69] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'==' @ [60:42] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classNode' @ [60:43] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [60:53] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_PROTECTED' @ [60:72] ==> public const final val ACC_PROTECTED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'==' @ [61:42] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classNode' @ [61:43] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [61:53] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_PRIVATE' @ [61:72] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'!=' @ [63:31] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classNode' @ [63:32] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [63:42] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_STATIC' @ [63:61] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'TODO' @ [65:51] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [67:41] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'lazy' @ [69:34] ==> public fun <T> lazy(initializer: () -> List<SmartMockReferenceType.MockMethod>): Lazy<List<SmartMockReferenceType.MockMethod>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<MockMethod>

'classNode' @ [69:41] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'methods' @ [69:51] ==> public final var methods: (MutableList<(MethodNode..MethodNode?)>..List<(MethodNode..MethodNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'map' @ [69:59] ==> public inline fun <T, R> Iterable<(MethodNode..MethodNode?)>.map(transform: ((MethodNode..MethodNode?)) -> SmartMockReferenceType.MockMethod): List<SmartMockReferenceType.MockMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.MethodNode..org.jetbrains.org.objectweb.asm.tree.MethodNode?)
    <R> -> MockMethod

'MockMethod' @ [69:65] ==> public constructor MockMethod(methodNode: MethodNode, containingClass: SmartMockReferenceType) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[ClassConstructorDescriptorImpl]

'it' @ [69:76] ==> value-parameter it: (MethodNode..MethodNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.methodsCached.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [69:80] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[LazyClassReceiverParameterDescriptor]

'methodsCached' @ [71:30] ==> private final val methodsCached: List<SmartMockReferenceType.MockMethod> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'TODO' @ [73:36] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classNode' @ [75:32] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [75:42] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'!=' @ [77:34] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classNode' @ [77:35] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [77:45] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_PROTECTED' @ [77:64] ==> public const final val ACC_PROTECTED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'!=' @ [79:30] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classNode' @ [79:31] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [79:41] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_FINAL' @ [79:60] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodsCached' @ [81:39] ==> private final val methodsCached: List<SmartMockReferenceType.MockMethod> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'flatMap' @ [81:53] ==> public inline fun <T, R> Iterable<SmartMockReferenceType.MockMethod>.flatMap(transform: (SmartMockReferenceType.MockMethod) -> Iterable<Location>): List<Location> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockMethod
    <R> -> Location

'it' @ [81:63] ==> value-parameter it: SmartMockReferenceType.MockMethod defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.allLineLocations.<anonymous>[ValueParameterDescriptorImpl]

'allLineLocations' @ [81:66] ==> public open fun allLineLocations(): List<Location> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[SimpleFunctionDescriptorImpl]

'TODO' @ [83:74] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classNode' @ [85:48] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'signature' @ [85:58] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'TODO' @ [87:35] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [89:40] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [91:35] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!=' @ [93:33] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classNode' @ [93:34] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [93:44] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_ABSTRACT' @ [93:63] ==> public const final val ACC_ABSTRACT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'TODO' @ [95:53] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [97:43] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [99:37] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classNode' @ [103:27] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'name' @ [103:37] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'replace' @ [103:42] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'TODO' @ [107:53] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [109:90] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [111:59] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classNode' @ [114:32] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'innerClasses' @ [114:42] ==> public final var innerClasses: (MutableList<(InnerClassNode..InnerClassNode?)>..List<(InnerClassNode..InnerClassNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'filter' @ [115:18] ==> public inline fun <T> Iterable<(InnerClassNode..InnerClassNode?)>.filter(predicate: ((InnerClassNode..InnerClassNode?)) -> Boolean): List<(InnerClassNode..InnerClassNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InnerClassNode..org.jetbrains.org.objectweb.asm.tree.InnerClassNode?)

'it' @ [115:27] ==> value-parameter it: (InnerClassNode..InnerClassNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.nestedTypes.<anonymous>[ValueParameterDescriptorImpl]

'outerName' @ [115:30] ==> public final var outerName: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.InnerClassNode[JavaPropertyDescriptor]

'classNode' @ [115:43] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'name' @ [115:53] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'mapNotNull' @ [116:18] ==> public inline fun <T, R : Any> Iterable<(InnerClassNode..InnerClassNode?)>.mapNotNull(transform: ((InnerClassNode..InnerClassNode?)) -> ClassNode?): List<ClassNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InnerClassNode..org.jetbrains.org.objectweb.asm.tree.InnerClassNode?)
    <R : Any> -> ClassNode

'context' @ [116:31] ==> private final val context: SmartMockReferenceTypeContext defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'classes' @ [116:39] ==> public final val classes: List<ClassNode> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext[PropertyDescriptorImpl]

'find' @ [116:47] ==> @InlineOnly public inline fun <T> Iterable<ClassNode>.find(predicate: (ClassNode) -> Boolean): ClassNode? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'it' @ [116:59] ==> value-parameter it: (InnerClassNode..InnerClassNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.nestedTypes.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [116:62] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.InnerClassNode[JavaPropertyDescriptor]

'c' @ [116:70] ==> value-parameter c: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.nestedTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [116:72] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'context' @ [118:32] ==> private final val context: SmartMockReferenceTypeContext defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'classes' @ [118:40] ==> public final val classes: List<ClassNode> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext[PropertyDescriptorImpl]

'filter' @ [118:48] ==> public inline fun <T> Iterable<ClassNode>.filter(predicate: (ClassNode) -> Boolean): List<ClassNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'it' @ [118:57] ==> value-parameter it: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.nestedTypes.<anonymous>[ValueParameterDescriptorImpl]

'outerClass' @ [118:60] ==> public final var outerClass: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'classNode' @ [118:74] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'name' @ [118:84] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'fromInnerClasses' @ [120:17] ==> val fromInnerClasses: List<ClassNode> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.nestedTypes[LocalVariableDescriptor]

'fromOuterClasses' @ [120:36] ==> val fromOuterClasses: List<ClassNode> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.nestedTypes[LocalVariableDescriptor]

'distinctBy' @ [120:54] ==> public inline fun <T, K> Iterable<ClassNode>.distinctBy(selector: (ClassNode) -> (String..String?)): List<ClassNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode
    <K> -> (kotlin.String..kotlin.String?)

'it' @ [120:67] ==> value-parameter it: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.nestedTypes.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [120:70] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'map' @ [120:77] ==> public inline fun <T, R> Iterable<ClassNode>.map(transform: (ClassNode) -> SmartMockReferenceType): List<SmartMockReferenceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode
    <R> -> SmartMockReferenceType

'SmartMockReferenceType' @ [120:83] ==> public constructor SmartMockReferenceType(classNode: ClassNode, context: SmartMockReferenceTypeContext) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[ClassConstructorDescriptorImpl]

'it' @ [120:106] ==> value-parameter it: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.nestedTypes.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [120:110] ==> private final val context: SmartMockReferenceTypeContext defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'listOf' @ [123:49] ==> public fun <T> listOf(element: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'classNode' @ [123:56] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'sourceFile' @ [123:66] ==> public final var sourceFile: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'context' @ [127:37] ==> private final val context: SmartMockReferenceTypeContext defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'virtualMachine' @ [127:45] ==> public final val virtualMachine: MockVirtualMachine defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext[PropertyDescriptorImpl]

'TODO' @ [129:35] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [131:34] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!=' @ [133:32] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classNode' @ [133:33] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'access' @ [133:43] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'ACC_PRIVATE' @ [133:62] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'classNode' @ [135:41] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'signature' @ [135:51] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'listOf' @ [137:49] ==> public fun <T> listOf(element: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'classNode' @ [137:56] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'sourceFile' @ [137:66] ==> public final var sourceFile: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'TODO' @ [139:47] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [141:60] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [143:38] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'TODO' @ [145:33] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [148:13] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[LazyClassReceiverParameterDescriptor]

'other' @ [148:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.equals[ValueParameterDescriptorImpl]

'other' @ [149:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.equals[ValueParameterDescriptorImpl]

'javaClass' @ [149:20] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'javaClass' @ [149:33] ==> public val <T : Any> SmartMockReferenceType.javaClass: Class<SmartMockReferenceType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SmartMockReferenceType

'other' @ [151:9] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.equals[ValueParameterDescriptorImpl]

'classNode' @ [153:16] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'name' @ [153:26] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'other' @ [153:34] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.equals[ValueParameterDescriptorImpl]

'classNode' @ [153:40] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'name' @ [153:50] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'classNode' @ [158:16] ==> public final val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'name' @ [158:26] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'hashCode' @ [158:31] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [162:46] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'name' @ [162:57] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'!=' @ [164:35] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [164:36] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [164:47] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_PUBLIC' @ [164:66] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'TODO' @ [166:44] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!=' @ [168:35] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [168:36] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [168:47] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_NATIVE' @ [168:66] ==> public const final val ACC_NATIVE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'TODO' @ [170:36] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [173:35] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'instructions' @ [173:46] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'instructionList' @ [174:27] ==> val instructionList: InsnList defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.location[LocalVariableDescriptor]

'first' @ [174:43] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'current' @ [175:20] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.location[LocalVariableDescriptor]

'current' @ [176:21] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.location[LocalVariableDescriptor]

'MockLocation' @ [177:28] ==> public constructor MockLocation(method: SmartMockReferenceType.MockMethod, line: Int) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockLocation[ClassConstructorDescriptorImpl]

'this' @ [177:41] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[LazyClassReceiverParameterDescriptor]

'current' @ [177:47] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.location[LocalVariableDescriptor]

'line' @ [177:55] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'current' @ [179:17] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.location[LocalVariableDescriptor]

'current' @ [179:27] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.location[LocalVariableDescriptor]

'next' @ [179:35] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'==' @ [184:43] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [184:44] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [184:55] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_PUBLIC' @ [184:74] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'==' @ [185:46] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [185:47] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [185:58] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_PROTECTED' @ [185:77] ==> public const final val ACC_PROTECTED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'==' @ [186:46] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [186:47] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [186:58] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_PRIVATE' @ [186:77] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'!=' @ [188:35] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [188:36] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [188:47] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_STATIC' @ [188:66] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodNode' @ [190:36] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [190:47] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'!=' @ [192:35] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [192:36] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [192:47] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_BRIDGE' @ [192:66] ==> public const final val ACC_BRIDGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'!=' @ [194:38] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [194:39] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [194:50] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_PROTECTED' @ [194:69] ==> public const final val ACC_PROTECTED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'!=' @ [196:34] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [196:35] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [196:46] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_FINAL' @ [196:65] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodNode' @ [199:35] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'instructions' @ [199:46] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'emptyList' @ [199:69] ==> public fun <T> emptyList(): List<Location> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Location

'instructionList' @ [200:27] ==> val instructionList: InsnList defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.allLineLocations[LocalVariableDescriptor]

'first' @ [200:43] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'mutableListOf' @ [201:29] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Location> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Location

'current' @ [202:20] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.allLineLocations[LocalVariableDescriptor]

'current' @ [203:21] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.allLineLocations[LocalVariableDescriptor]

'locations' @ [204:21] ==> val locations: MutableList<Location> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.allLineLocations[LocalVariableDescriptor]

'MockLocation' @ [204:34] ==> public constructor MockLocation(method: SmartMockReferenceType.MockMethod, line: Int) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockLocation[ClassConstructorDescriptorImpl]

'this' @ [204:47] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[LazyClassReceiverParameterDescriptor]

'current' @ [204:53] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.allLineLocations[LocalVariableDescriptor]

'line' @ [204:61] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'current' @ [206:17] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.allLineLocations[LocalVariableDescriptor]

'current' @ [206:27] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.allLineLocations[LocalVariableDescriptor]

'next' @ [206:35] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'locations' @ [208:20] ==> val locations: MutableList<Location> defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod.allLineLocations[LocalVariableDescriptor]

'TODO' @ [211:67] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [213:43] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!=' @ [215:37] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [215:38] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [215:49] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_ABSTRACT' @ [215:68] ==> public const final val ACC_ABSTRACT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'TODO' @ [217:37] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [219:50] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [223:53] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [225:40] ==> public final val containingClass: SmartMockReferenceType defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'TODO' @ [227:40] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [229:54] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [231:36] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [233:40] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'name' @ [233:51] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'TODO' @ [235:41] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [237:49] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [239:75] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [241:36] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [243:36] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!=' @ [245:38] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [245:39] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [245:50] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_SYNTHETIC' @ [245:69] ==> public const final val ACC_SYNTHETIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodNode' @ [247:40] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'name' @ [247:51] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'containingClass' @ [249:41] ==> public final val containingClass: SmartMockReferenceType defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'context' @ [249:57] ==> private final val context: SmartMockReferenceTypeContext defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'virtualMachine' @ [249:65] ==> public final val virtualMachine: MockVirtualMachine defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext[PropertyDescriptorImpl]

'TODO' @ [251:41] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!=' @ [253:36] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [253:37] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'access' @ [253:48] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_PRIVATE' @ [253:67] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodNode' @ [255:45] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'signature' @ [255:56] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'method' @ [259:37] ==> public final val method: SmartMockReferenceType.MockMethod defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockLocation[PropertyDescriptorImpl]

'containingClass' @ [259:44] ==> public final val containingClass: SmartMockReferenceType defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'sourceName' @ [259:60] ==> public open fun sourceName(): String? defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[SimpleFunctionDescriptorImpl]

'TODO' @ [261:52] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [263:36] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'line' @ [265:37] ==> public final val line: Int defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockLocation[PropertyDescriptorImpl]

'TODO' @ [267:52] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'method' @ [269:41] ==> public final val method: SmartMockReferenceType.MockMethod defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockLocation[PropertyDescriptorImpl]

'containingClass' @ [269:48] ==> public final val containingClass: SmartMockReferenceType defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'context' @ [269:64] ==> private final val context: SmartMockReferenceTypeContext defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType[PropertyDescriptorImpl]

'virtualMachine' @ [269:72] ==> public final val virtualMachine: MockVirtualMachine defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceTypeContext[PropertyDescriptorImpl]

'TODO' @ [271:52] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'sourceName' @ [273:37] ==> public open fun sourceName(): String? defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockLocation[SimpleFunctionDescriptorImpl]

'TODO' @ [275:52] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'method' @ [277:40] ==> public final val method: SmartMockReferenceType.MockMethod defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockLocation[PropertyDescriptorImpl]

'containingClass' @ [277:47] ==> public final val containingClass: SmartMockReferenceType defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockMethod[PropertyDescriptorImpl]

'method' @ [279:33] ==> public final val method: SmartMockReferenceType.MockMethod defined in org.jetbrains.kotlin.idea.debugger.SmartMockReferenceType.MockLocation[PropertyDescriptorImpl]

