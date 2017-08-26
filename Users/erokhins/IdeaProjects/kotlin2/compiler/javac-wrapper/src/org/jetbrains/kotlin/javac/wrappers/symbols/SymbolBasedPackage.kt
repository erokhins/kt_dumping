'SymbolBasedElement<PackageElement>' @ [31:5] ==> public constructor SymbolBasedElement<out T : Element>(element: PackageElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedElement[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Element> -> PackageElement

'element' @ [31:40] ==> value-parameter element: PackageElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage.<init>[ValueParameterDescriptorImpl]

'javac' @ [31:49] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage.<init>[ValueParameterDescriptorImpl]

'FqName' @ [34:17] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'element' @ [34:24] ==> public final val element: PackageElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[PropertyDescriptorImpl]

'qualifiedName' @ [34:32] ==> public final val PackageElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [34:46] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'javac' @ [37:17] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[PropertyDescriptorImpl]

'findSubPackages' @ [37:23] ==> public final fun findSubPackages(fqName: FqName): List<JavaPackage> defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'FqName' @ [37:39] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'element' @ [37:46] ==> public final val element: PackageElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[PropertyDescriptorImpl]

'qualifiedName' @ [37:54] ==> public final val PackageElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [37:68] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'element' @ [41:17] ==> public final val element: PackageElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[PropertyDescriptorImpl]

'annotationMirrors' @ [41:25] ==> public final val PackageElement.annotationMirrors: (MutableList<out (AnnotationMirror..AnnotationMirror?)>..List<(AnnotationMirror..AnnotationMirror?)>?)[MyPropertyDescriptor]

'map' @ [41:43] ==> public inline fun <T, R> Iterable<(AnnotationMirror..AnnotationMirror?)>.map(transform: ((AnnotationMirror..AnnotationMirror?)) -> SymbolBasedAnnotation): List<SymbolBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.AnnotationMirror..javax.lang.model.element.AnnotationMirror?)
    <R> -> SymbolBasedAnnotation

'SymbolBasedAnnotation' @ [41:49] ==> public constructor SymbolBasedAnnotation(annotationMirror: AnnotationMirror, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [41:71] ==> value-parameter it: (AnnotationMirror..AnnotationMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage.<get-annotations>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [41:75] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[PropertyDescriptorImpl]

'buildLazyValueForMap' @ [43:71] ==> public fun JavaAnnotationOwner.buildLazyValueForMap(): Lazy<Map<FqName?, JavaAnnotation>> defined in org.jetbrains.kotlin.load.java.structure[DeserializedSimpleFunctionDescriptor]

'javac' @ [46:13] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[PropertyDescriptorImpl]

'findClassesFromPackage' @ [46:19] ==> public final fun findClassesFromPackage(fqName: FqName): List<JavaClass> defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [46:42] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[PropertyDescriptorImpl]

'filter' @ [46:50] ==> public inline fun <T> Iterable<JavaClass>.filter(predicate: (JavaClass) -> Boolean): List<JavaClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass

'invoke' @ [46:59] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [46:70] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage.getClasses.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [46:73] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'element' @ [48:31] ==> public final val element: PackageElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[PropertyDescriptorImpl]

'qualifiedName' @ [48:39] ==> public final val PackageElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [48:53] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

