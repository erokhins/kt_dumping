'parent' @ [19:16] ==> public final val parent: RoundEnvironment defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'rootElements' @ [19:23] ==> public final val RoundEnvironment.rootElements: (MutableSet<out (Element..Element?)>..Set<(Element..Element?)>?)[MyPropertyDescriptor]

'parent' @ [23:24] ==> public final val parent: RoundEnvironment defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'getElementsAnnotatedWith' @ [23:31] ==> public abstract fun getElementsAnnotatedWith(p0: (TypeElement..TypeElement?)): (MutableSet<out (Element..Element?)>..Set<(Element..Element?)>?) defined in javax.annotation.processing.RoundEnvironment[JavaMethodDescriptor]

'a' @ [23:56] ==> value-parameter a: TypeElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.getElementsAnnotatedWith[ValueParameterDescriptorImpl]

'toHashSet' @ [23:59] ==> public fun <T> Iterable<(Element..Element?)>.toHashSet(): HashSet<(Element..Element?)> /* = HashSet<(Element..Element?)> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)

'elements' @ [24:9] ==> val elements: HashSet<(Element..Element?)> /* = HashSet<(Element..Element?)> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.getElementsAnnotatedWith[LocalVariableDescriptor]

'addAll' @ [24:18] ==> public open fun addAll(elements: Collection<(Element..Element?)>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'resolveKotlinElements' @ [24:25] ==> private final fun resolveKotlinElements(annotationFqName: String): Set<Element> defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'a' @ [24:47] ==> value-parameter a: TypeElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.getElementsAnnotatedWith[ValueParameterDescriptorImpl]

'qualifiedName' @ [24:49] ==> public final val TypeElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [24:63] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'elements' @ [25:16] ==> val elements: HashSet<(Element..Element?)> /* = HashSet<(Element..Element?)> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.getElementsAnnotatedWith[LocalVariableDescriptor]

'parent' @ [29:24] ==> public final val parent: RoundEnvironment defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'getElementsAnnotatedWith' @ [29:31] ==> public abstract fun getElementsAnnotatedWith(p0: (Class<out (Annotation..Annotation?)>..Class<out (Annotation..Annotation?)>?)): (MutableSet<out (Element..Element?)>..Set<(Element..Element?)>?) defined in javax.annotation.processing.RoundEnvironment[JavaMethodDescriptor]

'a' @ [29:56] ==> value-parameter a: Class<out Annotation> defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.getElementsAnnotatedWith[ValueParameterDescriptorImpl]

'toHashSet' @ [29:59] ==> public fun <T> Iterable<(Element..Element?)>.toHashSet(): HashSet<(Element..Element?)> /* = HashSet<(Element..Element?)> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)

'elements' @ [30:9] ==> val elements: HashSet<(Element..Element?)> /* = HashSet<(Element..Element?)> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.getElementsAnnotatedWith[LocalVariableDescriptor]

'addAll' @ [30:18] ==> public open fun addAll(elements: Collection<(Element..Element?)>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'resolveKotlinElements' @ [30:25] ==> private final fun resolveKotlinElements(annotationFqName: String): Set<Element> defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'a' @ [30:47] ==> value-parameter a: Class<out Annotation> defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.getElementsAnnotatedWith[ValueParameterDescriptorImpl]

'name' @ [30:49] ==> public final val <T : (Any..Any?)> Class<out Annotation>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Annotation

'elements' @ [31:16] ==> val elements: HashSet<(Element..Element?)> /* = HashSet<(Element..Element?)> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.getElementsAnnotatedWith[LocalVariableDescriptor]

'parent' @ [34:37] ==> public final val parent: RoundEnvironment defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'processingOver' @ [34:44] ==> public abstract fun processingOver(): Boolean defined in javax.annotation.processing.RoundEnvironment[JavaMethodDescriptor]

'parent' @ [36:34] ==> public final val parent: RoundEnvironment defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'errorRaised' @ [36:41] ==> public abstract fun errorRaised(): Boolean defined in javax.annotation.processing.RoundEnvironment[JavaMethodDescriptor]

'enclosedElements' @ [39:16] ==> public final val TypeElement.enclosedElements: (MutableList<out (Element..Element?)>..List<(Element..Element?)>?)[MyPropertyDescriptor]

'filter' @ [39:33] ==> public inline fun <T> Iterable<(Element..Element?)>.filter(predicate: ((Element..Element?)) -> Boolean): List<(Element..Element?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)

'it' @ [39:42] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.filterEnclosedElements.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [39:45] ==> public final val Element.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'kind' @ [39:53] ==> value-parameter kind: ElementKind defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.filterEnclosedElements[ValueParameterDescriptorImpl]

'it' @ [39:61] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.filterEnclosedElements.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [39:64] ==> public final val Element.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [39:75] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'name' @ [39:89] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.filterEnclosedElements[ValueParameterDescriptorImpl]

'enclosedElements' @ [43:16] ==> public final val TypeElement.enclosedElements: (MutableList<out (Element..Element?)>..List<(Element..Element?)>?)[MyPropertyDescriptor]

'filter' @ [43:33] ==> public inline fun <T> Iterable<(Element..Element?)>.filter(predicate: ((Element..Element?)) -> Boolean): List<(Element..Element?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.Element..javax.lang.model.element.Element?)

'it' @ [43:42] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.filterEnclosedElements.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [43:45] ==> public final val Element.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'kind' @ [43:53] ==> value-parameter kind: ElementKind defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.filterEnclosedElements[ValueParameterDescriptorImpl]

'annotationMirrors' @ [47:16] ==> public final val Element.annotationMirrors: (MutableList<out (AnnotationMirror..AnnotationMirror?)>..List<(AnnotationMirror..AnnotationMirror?)>?)[MyPropertyDescriptor]

'any' @ [47:34] ==> public inline fun <T> Iterable<(AnnotationMirror..AnnotationMirror?)>.any(predicate: ((AnnotationMirror..AnnotationMirror?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.AnnotationMirror..javax.lang.model.element.AnnotationMirror?)

'annotationFqName' @ [47:40] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.hasAnnotation[ValueParameterDescriptorImpl]

'it' @ [47:60] ==> value-parameter it: (AnnotationMirror..AnnotationMirror?) defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.hasAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'annotationType' @ [47:63] ==> public final val AnnotationMirror.annotationType: (DeclaredType..DeclaredType?)[MyPropertyDescriptor]

'asElement' @ [47:78] ==> public abstract fun asElement(): (Element..Element?) defined in javax.lang.model.type.DeclaredType[JavaMethodDescriptor]

'toString' @ [47:90] ==> public open fun toString(): String defined in javax.lang.model.element.Element[DeserializedSimpleFunctionDescriptor]

'hasAnnotation' @ [51:13] ==> private final fun Element.hasAnnotation(annotationFqName: String): Boolean defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [51:27] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.hasInheritedAnnotation[ValueParameterDescriptorImpl]

'superclass' @ [53:32] ==> public final val TypeElement.superclass: (TypeMirror..TypeMirror?)[MyPropertyDescriptor]

'superclassMirror' @ [54:13] ==> val superclassMirror: (TypeMirror..TypeMirror?) defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.hasInheritedAnnotation[LocalVariableDescriptor]

'processingEnv' @ [56:26] ==> public final val processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'typeUtils' @ [56:40] ==> public final val ProcessingEnvironment.typeUtils: (Types..Types?)[MyPropertyDescriptor]

'asElement' @ [56:50] ==> public abstract fun asElement(p0: (TypeMirror..TypeMirror?)): (Element..Element?) defined in javax.lang.model.util.Types[JavaMethodDescriptor]

'superclassMirror' @ [56:60] ==> val superclassMirror: (TypeMirror..TypeMirror?) defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.hasInheritedAnnotation[LocalVariableDescriptor]

'superClass' @ [57:13] ==> val superClass: (Element..Element?) defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.hasInheritedAnnotation[LocalVariableDescriptor]

'superClass' @ [59:16] ==> val superClass: (Element..Element?) defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.hasInheritedAnnotation[LocalVariableDescriptor]

'hasInheritedAnnotation' @ [59:27] ==> private final fun TypeElement.hasInheritedAnnotation(annotationFqName: String): Boolean defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [59:50] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.hasInheritedAnnotation[ValueParameterDescriptorImpl]

'roundNumber' @ [63:13] ==> public final val roundNumber: Int defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'setOf' @ [63:37] ==> @InlineOnly public inline fun <T> setOf(): Set<Element> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element

'kotlinAnnotationsProvider' @ [65:27] ==> public final val kotlinAnnotationsProvider: KotlinAnnotationProvider defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'annotatedKotlinElements' @ [65:53] ==> public final val annotatedKotlinElements: Map<String, Set<AnnotatedElement>> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'get' @ [65:77] ==> public abstract operator fun get(key: String): Set<AnnotatedElement>? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'annotationFqName' @ [65:81] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[ValueParameterDescriptorImpl]

'setOf' @ [65:102] ==> @InlineOnly public inline fun <T> setOf(): Set<AnnotatedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotatedElement

'descriptors' @ [66:37] ==> val descriptors: Set<AnnotatedElement> defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[LocalVariableDescriptor]

'fold' @ [66:49] ==> public inline fun <T, R> Iterable<AnnotatedElement>.fold(initial: HashSet<Element> /* = HashSet<Element> */, operation: (HashSet<Element> /* = HashSet<Element> */, AnnotatedElement) -> HashSet<Element> /* = HashSet<Element> */): HashSet<Element> /* = HashSet<Element> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotatedElement
    <R> -> HashSet<Element>

'hashSetOf' @ [66:54] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<Element> /* = HashSet<Element> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element

'processingEnv' @ [67:25] ==> public final val processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'elementUtils' @ [67:39] ==> public final val ProcessingEnvironment.elementUtils: (Elements..Elements?)[MyPropertyDescriptor]

'getTypeElement' @ [67:52] ==> public abstract fun getTypeElement(p0: (CharSequence..CharSequence?)): (TypeElement..TypeElement?) defined in javax.lang.model.util.Elements[JavaMethodDescriptor]

'descriptor' @ [67:67] ==> value-parameter descriptor: AnnotatedElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'classFqName' @ [67:78] ==> public final val classFqName: String defined in org.jetbrains.kotlin.annotation.AnnotatedElement[PropertyDescriptorImpl]

'set' @ [67:106] ==> value-parameter set: HashSet<Element> /* = HashSet<Element> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'when (descriptor) {
                is AnnotatedElement.Class -> set.add(clazz)
                is AnnotatedElement.Constructor -> {
                    set.addAll(clazz.filterEnclosedElements(ElementKind.CONSTRUCTOR)
                            .filter { it.hasAnnotation(annotationFqName) })
                }
                is AnnotatedElement.Field -> {
                    set.addAll(clazz.filterEnclosedElements(ElementKind.FIELD, descriptor.fieldName)
                            .filter { it.hasAnnotation(annotationFqName) })
                }
                is AnnotatedElement.Method -> {
                    set.addAll(clazz.filterEnclosedElements(ElementKind.METHOD, descriptor.methodName)
                            .filter { it.hasAnnotation(annotationFqName) })
                }
            }' @ [68:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'descriptor' @ [68:19] ==> value-parameter descriptor: AnnotatedElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [69:46] ==> value-parameter set: HashSet<Element> /* = HashSet<Element> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [69:50] ==> public open fun add(element: Element): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'clazz' @ [69:54] ==> val clazz: TypeElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[LocalVariableDescriptor]

'set' @ [71:21] ==> value-parameter set: HashSet<Element> /* = HashSet<Element> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'addAll' @ [71:25] ==> public open fun addAll(elements: Collection<Element>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'clazz' @ [71:32] ==> val clazz: TypeElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[LocalVariableDescriptor]

'filterEnclosedElements' @ [71:38] ==> private final fun TypeElement.filterEnclosedElements(kind: ElementKind): List<Element> defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'CONSTRUCTOR' @ [71:73] ==> enum entry CONSTRUCTOR defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'filter' @ [72:30] ==> public inline fun <T> Iterable<Element>.filter(predicate: (Element) -> Boolean): List<Element> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element

'it' @ [72:39] ==> value-parameter it: Element defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasAnnotation' @ [72:42] ==> private final fun Element.hasAnnotation(annotationFqName: String): Boolean defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [72:56] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[ValueParameterDescriptorImpl]

'set' @ [75:21] ==> value-parameter set: HashSet<Element> /* = HashSet<Element> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'addAll' @ [75:25] ==> public open fun addAll(elements: Collection<Element>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'clazz' @ [75:32] ==> val clazz: TypeElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[LocalVariableDescriptor]

'filterEnclosedElements' @ [75:38] ==> private final fun TypeElement.filterEnclosedElements(kind: ElementKind, name: String): List<Element> defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'FIELD' @ [75:73] ==> enum entry FIELD defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'descriptor' @ [75:80] ==> value-parameter descriptor: AnnotatedElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'fieldName' @ [75:91] ==> public final val fieldName: String defined in org.jetbrains.kotlin.annotation.AnnotatedElement.Field[PropertyDescriptorImpl]

'filter' @ [76:30] ==> public inline fun <T> Iterable<Element>.filter(predicate: (Element) -> Boolean): List<Element> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element

'it' @ [76:39] ==> value-parameter it: Element defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasAnnotation' @ [76:42] ==> private final fun Element.hasAnnotation(annotationFqName: String): Boolean defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [76:56] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[ValueParameterDescriptorImpl]

'set' @ [79:21] ==> value-parameter set: HashSet<Element> /* = HashSet<Element> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'addAll' @ [79:25] ==> public open fun addAll(elements: Collection<Element>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'clazz' @ [79:32] ==> val clazz: TypeElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[LocalVariableDescriptor]

'filterEnclosedElements' @ [79:38] ==> private final fun TypeElement.filterEnclosedElements(kind: ElementKind, name: String): List<Element> defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'METHOD' @ [79:73] ==> enum entry METHOD defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'descriptor' @ [79:81] ==> value-parameter descriptor: AnnotatedElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'methodName' @ [79:92] ==> public final val methodName: String defined in org.jetbrains.kotlin.annotation.AnnotatedElement.Method[PropertyDescriptorImpl]

'filter' @ [80:30] ==> public inline fun <T> Iterable<Element>.filter(predicate: (Element) -> Boolean): List<Element> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element

'it' @ [80:39] ==> value-parameter it: Element defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasAnnotation' @ [80:42] ==> private final fun Element.hasAnnotation(annotationFqName: String): Boolean defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [80:56] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[ValueParameterDescriptorImpl]

'set' @ [83:13] ==> value-parameter set: HashSet<Element> /* = HashSet<Element> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'kotlinAnnotationsProvider' @ [86:13] ==> public final val kotlinAnnotationsProvider: KotlinAnnotationProvider defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'supportInheritedAnnotations' @ [86:39] ==> public final val supportInheritedAnnotations: Boolean defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'processingEnv' @ [87:31] ==> public final val processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'elementUtils' @ [87:45] ==> public final val ProcessingEnvironment.elementUtils: (Elements..Elements?)[MyPropertyDescriptor]

'getTypeElement' @ [87:58] ==> public abstract fun getTypeElement(p0: (CharSequence..CharSequence?)): (TypeElement..TypeElement?) defined in javax.lang.model.util.Elements[JavaMethodDescriptor]

'annotationFqName' @ [87:73] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[ValueParameterDescriptorImpl]

'hasAnnotation' @ [88:23] ==> private final fun Element.hasAnnotation(annotationFqName: String): Boolean defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'Inherited' @ [88:37] ==> public constructor Inherited() defined in java.lang.annotation.Inherited[JavaClassConstructorDescriptor]

'java' @ [88:54] ==> public val <T> KClass<Inherited>.java: Class<Inherited> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Inherited

'canonicalName' @ [88:59] ==> public final val <T : (Any..Any?)> Class<Inherited>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Inherited

'isInherited' @ [90:17] ==> val isInherited: Boolean defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[LocalVariableDescriptor]

'kotlinAnnotationsProvider' @ [91:17] ==> public final val kotlinAnnotationsProvider: KotlinAnnotationProvider defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'kotlinClasses' @ [91:43] ==> public final val kotlinClasses: Set<String> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'forEach' @ [91:57] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'processingEnv' @ [92:33] ==> public final val processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[PropertyDescriptorImpl]

'elementUtils' @ [92:47] ==> public final val ProcessingEnvironment.elementUtils: (Elements..Elements?)[MyPropertyDescriptor]

'getTypeElement' @ [92:60] ==> public abstract fun getTypeElement(p0: (CharSequence..CharSequence?)): (TypeElement..TypeElement?) defined in javax.lang.model.util.Elements[JavaMethodDescriptor]

'classFqName' @ [92:75] ==> value-parameter classFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[ValueParameterDescriptorImpl]

'clazz' @ [93:25] ==> val clazz: TypeElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[LocalVariableDescriptor]

'hasInheritedAnnotation' @ [93:31] ==> private final fun TypeElement.hasInheritedAnnotation(annotationFqName: String): Boolean defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[SimpleFunctionDescriptorImpl]

'annotationFqName' @ [93:54] ==> value-parameter annotationFqName: String defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[ValueParameterDescriptorImpl]

'descriptorsWithKotlin' @ [94:25] ==> val descriptorsWithKotlin: HashSet<Element> /* = HashSet<Element> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[LocalVariableDescriptor]

'add' @ [94:47] ==> public open fun add(element: Element): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'clazz' @ [94:51] ==> val clazz: TypeElement defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements.<anonymous>[LocalVariableDescriptor]

'descriptorsWithKotlin' @ [100:16] ==> val descriptorsWithKotlin: HashSet<Element> /* = HashSet<Element> */ defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper.resolveKotlinElements[LocalVariableDescriptor]

