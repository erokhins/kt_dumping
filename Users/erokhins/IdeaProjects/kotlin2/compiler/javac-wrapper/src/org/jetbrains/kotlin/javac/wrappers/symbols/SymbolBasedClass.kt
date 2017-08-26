'SymbolBasedClassifier<TypeElement>' @ [40:5] ==> public constructor SymbolBasedClassifier<out T : Element>(element: TypeElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Element> -> TypeElement

'element' @ [40:40] ==> value-parameter element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<init>[ValueParameterDescriptorImpl]

'javac' @ [40:49] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<init>[ValueParameterDescriptorImpl]

'identifier' @ [43:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [43:33] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'simpleName' @ [43:41] ==> public final val TypeElement.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [43:52] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'element' @ [46:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'isAbstract' @ [46:25] ==> internal val Element.isAbstract: Boolean defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[PropertyDescriptorImpl]

'element' @ [49:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'isStatic' @ [49:25] ==> internal val Element.isStatic: Boolean defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[PropertyDescriptorImpl]

'element' @ [52:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'isFinal' @ [52:25] ==> internal val Element.isFinal: Boolean defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[PropertyDescriptorImpl]

'element' @ [55:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'getVisibility' @ [55:25] ==> internal fun Element.getVisibility(): Visibility defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [58:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'typeParameters' @ [58:25] ==> public final val TypeElement.typeParameters: (MutableList<out (TypeParameterElement..TypeParameterElement?)>..List<(TypeParameterElement..TypeParameterElement?)>?)[MyPropertyDescriptor]

'map' @ [58:40] ==> public inline fun <T, R> Iterable<(TypeParameterElement..TypeParameterElement?)>.map(transform: ((TypeParameterElement..TypeParameterElement?)) -> SymbolBasedTypeParameter): List<SymbolBasedTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.TypeParameterElement..javax.lang.model.element.TypeParameterElement?)
    <R> -> SymbolBasedTypeParameter

'SymbolBasedTypeParameter' @ [58:46] ==> public constructor SymbolBasedTypeParameter(element: TypeParameterElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter[ClassConstructorDescriptorImpl]

'it' @ [58:71] ==> value-parameter it: (TypeParameterElement..TypeParameterElement?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-typeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [58:75] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'FqName' @ [61:17] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'element' @ [61:24] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'qualifiedName' @ [61:32] ==> public final val TypeElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [61:46] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'element' @ [64:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'interfaces' @ [64:25] ==> public final val TypeElement.interfaces: (MutableList<out (TypeMirror..TypeMirror?)>..List<(TypeMirror..TypeMirror?)>?)[MyPropertyDescriptor]

'toMutableList' @ [64:36] ==> public fun <T> Collection<(TypeMirror..TypeMirror?)>.toMutableList(): MutableList<(TypeMirror..TypeMirror?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)

'apply' @ [65:18] ==> @InlineOnly public inline fun <T> MutableList<(TypeMirror..TypeMirror?)>.apply(block: MutableList<(TypeMirror..TypeMirror?)>.() -> Unit): MutableList<(TypeMirror..TypeMirror?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>

'element' @ [66:21] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'superclass' @ [66:29] ==> public final val TypeElement.superclass: (TypeMirror..TypeMirror?)[MyPropertyDescriptor]

'takeIf' @ [66:40] ==> @InlineOnly @SinceKotlin public inline fun <T> (TypeMirror..TypeMirror?).takeIf(predicate: ((TypeMirror..TypeMirror?)) -> Boolean): TypeMirror? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)

'it' @ [66:49] ==> value-parameter it: (TypeMirror..TypeMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-supertypes>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [66:66] ==> @InlineOnly public inline fun <T, R> TypeMirror.let(block: (TypeMirror) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeMirror
    <R> -> Boolean

'this' @ [66:70] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-supertypes>.<anonymous>[ReceiverParameterDescriptorImpl]

'mapTo' @ [68:18] ==> public inline fun <T, R, C : MutableCollection<in SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>>> Iterable<(TypeMirror..TypeMirror?)>.mapTo(destination: ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> /* = ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> */, transform: ((TypeMirror..TypeMirror?)) -> SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>): ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> /* = ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)
    <R> -> SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>
    <C : MutableCollection<in R>> -> ArrayList<SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>>

'arrayListOf' @ [68:24] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> /* = ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>

'SymbolBasedClassifierType' @ [68:41] ==> public constructor SymbolBasedClassifierType<out T : TypeMirror>(typeMirror: (TypeMirror..TypeMirror?), javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TypeMirror> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)

'it' @ [68:67] ==> value-parameter it: (TypeMirror..TypeMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-supertypes>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [68:71] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'apply' @ [69:18] ==> @InlineOnly public inline fun <T> ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> /* = ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> */.apply(block: ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> /* = ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> */.() -> Unit): ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> /* = ArrayList<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>>

'isEmpty' @ [70:25] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [70:38] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'qualifiedName' @ [70:46] ==> public final val TypeElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [70:60] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'JAVA_LANG_OBJECT' @ [70:91] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'javac' @ [71:25] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'JAVA_LANG_OBJECT' @ [71:31] ==> public final val JAVA_LANG_OBJECT: SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>? defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'let' @ [71:49] ==> @InlineOnly public inline fun <T, R> SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>.let(block: (SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>
    <R> -> Boolean

'add' @ [71:55] ==> public open fun add(element: SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [71:59] ==> value-parameter it: SymbolBasedClassifierType<(TypeMirror..TypeMirror?)> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-supertypes>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [76:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'enclosedElements' @ [76:25] ==> public final val TypeElement.enclosedElements: (MutableList<out (Element..Element?)>..List<(Element..Element?)>?)[MyPropertyDescriptor]

'filterIsInstance' @ [77:18] ==> public fun <R> Iterable<*>.filterIsInstance(klass: Class<TypeElement>): List<TypeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> TypeElement

'java' @ [77:54] ==> public val <T> KClass<TypeElement>.java: Class<TypeElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TypeElement

'map' @ [78:18] ==> public inline fun <T, R> Iterable<TypeElement>.map(transform: (TypeElement) -> SymbolBasedClass): List<SymbolBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeElement
    <R> -> SymbolBasedClass

'SymbolBasedClass' @ [78:24] ==> public constructor SymbolBasedClass(element: TypeElement, javac: JavacWrapper, file: JavaFileObject?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[ClassConstructorDescriptorImpl]

'it' @ [78:41] ==> value-parameter it: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-innerClasses>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [78:45] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'file' @ [78:52] ==> public final val file: JavaFileObject? defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'associateBy' @ [79:18] ==> public inline fun <T, K> Iterable<SymbolBasedClass>.associateBy(keySelector: (SymbolBasedClass) -> Name): Map<Name, SymbolBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClass
    <K> -> Name

'element' @ [82:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'enclosingElement' @ [82:25] ==> public final val TypeElement.enclosingElement: (Element..Element?)[MyPropertyDescriptor]

'let' @ [82:43] ==> @InlineOnly public inline fun <T, R> Element.let(block: (Element) -> SymbolBasedClass?): SymbolBasedClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element
    <R> -> SymbolBasedClass?

'if (it.asType().kind != TypeKind.DECLARED) null else SymbolBasedClass(it as TypeElement, javac, file)' @ [83:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SymbolBasedClass?, elseBranch: SymbolBasedClass?): SymbolBasedClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SymbolBasedClass?

'it' @ [83:17] ==> value-parameter it: Element defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-outerClass>.<anonymous>[ValueParameterDescriptorImpl]

'asType' @ [83:20] ==> public abstract fun asType(): (TypeMirror..TypeMirror?) defined in javax.lang.model.element.Element[JavaMethodDescriptor]

'kind' @ [83:29] ==> public final val TypeMirror.kind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'DECLARED' @ [83:46] ==> enum entry DECLARED defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'SymbolBasedClass' @ [83:66] ==> public constructor SymbolBasedClass(element: TypeElement, javac: JavacWrapper, file: JavaFileObject?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[ClassConstructorDescriptorImpl]

'it' @ [83:83] ==> value-parameter it: Element defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-outerClass>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [83:102] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'file' @ [83:109] ==> public final val file: JavaFileObject? defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'element' @ [87:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'kind' @ [87:25] ==> public final val TypeElement.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'INTERFACE' @ [87:45] ==> enum entry INTERFACE defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'element' @ [90:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'kind' @ [90:25] ==> public final val TypeElement.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'ANNOTATION_TYPE' @ [90:45] ==> enum entry ANNOTATION_TYPE defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'element' @ [93:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'kind' @ [93:25] ==> public final val TypeElement.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'ENUM' @ [93:45] ==> enum entry ENUM defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'element' @ [99:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'enclosedElements' @ [99:25] ==> public final val TypeElement.enclosedElements: (MutableList<out (Element..Element?)>..List<(Element..Element?)>?)[MyPropertyDescriptor]

'filter' @ [100:18] ==> public inline fun <T> Iterable<(Element..Element?)>.filter(predicate: ((Element..Element?)) -> Boolean): List<(Element..Element?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)

'it' @ [100:27] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-methods>.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [100:30] ==> public final val Element.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'METHOD' @ [100:50] ==> enum entry METHOD defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'map' @ [101:18] ==> public inline fun <T, R> Iterable<(Element..Element?)>.map(transform: ((Element..Element?)) -> SymbolBasedMethod): List<SymbolBasedMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)
    <R> -> SymbolBasedMethod

'SymbolBasedMethod' @ [101:24] ==> public constructor SymbolBasedMethod(element: ExecutableElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod[ClassConstructorDescriptorImpl]

'it' @ [101:42] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-methods>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [101:67] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'element' @ [104:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'enclosedElements' @ [104:25] ==> public final val TypeElement.enclosedElements: (MutableList<out (Element..Element?)>..List<(Element..Element?)>?)[MyPropertyDescriptor]

'filter' @ [105:18] ==> public inline fun <T> Iterable<(Element..Element?)>.filter(predicate: ((Element..Element?)) -> Boolean): List<(Element..Element?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)

'it' @ [105:27] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-fields>.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [105:30] ==> public final val Element.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'isField' @ [105:35] ==> public final val ElementKind.isField: Boolean[MyPropertyDescriptor]

'isValidIdentifier' @ [105:51] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [105:69] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-fields>.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [105:72] ==> public final val Element.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [105:83] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'map' @ [106:18] ==> public inline fun <T, R> Iterable<(Element..Element?)>.map(transform: ((Element..Element?)) -> SymbolBasedField): List<SymbolBasedField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)
    <R> -> SymbolBasedField

'SymbolBasedField' @ [106:24] ==> public constructor SymbolBasedField(element: VariableElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedField[ClassConstructorDescriptorImpl]

'it' @ [106:41] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-fields>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [106:64] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'element' @ [109:17] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'enclosedElements' @ [109:25] ==> public final val TypeElement.enclosedElements: (MutableList<out (Element..Element?)>..List<(Element..Element?)>?)[MyPropertyDescriptor]

'filter' @ [110:18] ==> public inline fun <T> Iterable<(Element..Element?)>.filter(predicate: ((Element..Element?)) -> Boolean): List<(Element..Element?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)

'it' @ [110:27] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-constructors>.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [110:30] ==> public final val Element.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'CONSTRUCTOR' @ [110:50] ==> enum entry CONSTRUCTOR defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'map' @ [111:18] ==> public inline fun <T, R> Iterable<(Element..Element?)>.map(transform: ((Element..Element?)) -> SymbolBasedConstructor): List<SymbolBasedConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)
    <R> -> SymbolBasedConstructor

'SymbolBasedConstructor' @ [111:24] ==> public constructor SymbolBasedConstructor(element: ExecutableElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedConstructor[ClassConstructorDescriptorImpl]

'it' @ [111:47] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<get-constructors>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [111:72] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'innerClasses' @ [114:17] ==> public final val innerClasses: Map<Name, JavaClass> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'keys' @ [114:30] ==> public abstract val keys: Set<Name> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'lazy' @ [116:47] ==> public fun <T> lazy(initializer: () -> VirtualFile?): Lazy<VirtualFile?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile?

'file' @ [117:9] ==> public final val file: JavaFileObject? defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'let' @ [117:15] ==> @InlineOnly public inline fun <T, R> JavaFileObject.let(block: (JavaFileObject) -> VirtualFile?): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaFileObject
    <R> -> VirtualFile?

'javac' @ [117:21] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.<init>[ValueParameterDescriptorImpl]

'toVirtualFile' @ [117:27] ==> public final fun toVirtualFile(javaFileObject: JavaFileObject): VirtualFile? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'it' @ [117:41] ==> value-parameter it: JavaFileObject defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.virtualFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'innerClasses' @ [122:47] ==> public final val innerClasses: Map<Name, JavaClass> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'name' @ [122:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass.findInnerClass[ValueParameterDescriptorImpl]

