'AbstractProcessor' @ [29:33] ==> protected/*protected and package*/ constructor AbstractProcessor() defined in javax.annotation.processing.AbstractProcessor[JavaClassConstructorDescriptor]

'lazy' @ [50:41] ==> public fun <T> lazy(initializer: () -> Processor): Lazy<Processor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Processor

'forName' @ [52:34] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'processorFqName' @ [52:42] ==> private final val processorFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'newInstance' @ [52:59] ==> @CallerSensitive public open fun newInstance(): (Any..Any?) defined in java.lang.Class[JavaMethodDescriptor]

'instance' @ [53:13] ==> val instance: Processor? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.processor.<anonymous>[LocalVariableDescriptor]

'IllegalArgumentException' @ [53:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'processorFqName' @ [53:85] ==> private final val processorFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'AnnotationProcessorStub' @ [56:13] ==> public constructor AnnotationProcessorStub() defined in org.jetbrains.kotlin.annotation.AnnotationProcessorStub[ClassConstructorDescriptorImpl]

'Delegates' @ [60:57] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [60:67] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, ProcessingEnvironment> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ProcessingEnvironment

'Delegates' @ [62:72] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [62:82] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, KotlinAnnotationProvider> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KotlinAnnotationProvider

'emptySet' @ [66:55] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'processor' @ [74:16] ==> private final val processor: Processor defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'getCompletions' @ [74:26] ==> public abstract fun getCompletions(p0: (Element..Element?), p1: (AnnotationMirror..AnnotationMirror?), p2: (ExecutableElement..ExecutableElement?), p3: (String..String?)): (MutableIterable<(Completion..Completion?)>..Iterable<(Completion..Completion?)>?) defined in javax.annotation.processing.Processor[JavaMethodDescriptor]

'element' @ [74:41] ==> value-parameter element: Element? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.getCompletions[ValueParameterDescriptorImpl]

'annotation' @ [74:50] ==> value-parameter annotation: AnnotationMirror? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.getCompletions[ValueParameterDescriptorImpl]

'member' @ [74:62] ==> value-parameter member: ExecutableElement? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.getCompletions[ValueParameterDescriptorImpl]

'userText' @ [74:70] ==> value-parameter userText: String? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.getCompletions[ValueParameterDescriptorImpl]

'this' @ [78:9] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[LazyClassReceiverParameterDescriptor]

'processingEnv' @ [78:14] ==> private final var processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'processingEnv' @ [78:30] ==> value-parameter processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.init[ValueParameterDescriptorImpl]

'processor' @ [80:13] ==> private final val processor: Processor defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'processingEnv' @ [81:13] ==> value-parameter processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.init[ValueParameterDescriptorImpl]

'err' @ [81:27] ==> private final fun ProcessingEnvironment.err(message: String): Unit defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[SimpleFunctionDescriptorImpl]

'processorFqName' @ [81:61] ==> private final val processorFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'processingEnv' @ [85:35] ==> value-parameter processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.init[ValueParameterDescriptorImpl]

'options' @ [85:49] ==> public final val ProcessingEnvironment.options: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?)[MyPropertyDescriptor]

'KAPT_ANNOTATION_OPTION' @ [85:57] ==> public final val KAPT_ANNOTATION_OPTION: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.Companion[PropertyDescriptorImpl]

'if (annotationsFilePath != null) File(annotationsFilePath) else null' @ [86:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File?, elseBranch: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File?

'annotationsFilePath' @ [86:35] ==> val annotationsFilePath: String? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.init[LocalVariableDescriptor]

'File' @ [86:64] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'annotationsFilePath' @ [86:69] ==> val annotationsFilePath: String? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.init[LocalVariableDescriptor]

'kotlinAnnotationsProvider' @ [87:9] ==> private final var kotlinAnnotationsProvider: KotlinAnnotationProvider defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'if (annotationsFile != null && annotationsFile.exists()) {
            KotlinAnnotationProvider(annotationsFile)
        }
        else {
            KotlinAnnotationProvider()
        }' @ [87:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinAnnotationProvider, elseBranch: KotlinAnnotationProvider): KotlinAnnotationProvider[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinAnnotationProvider

'annotationsFile' @ [87:41] ==> val annotationsFile: File? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.init[LocalVariableDescriptor]

'annotationsFile' @ [87:68] ==> val annotationsFile: File? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.init[LocalVariableDescriptor]

'exists' @ [87:84] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'KotlinAnnotationProvider' @ [88:13] ==> public constructor KotlinAnnotationProvider(annotationsFile: File) defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[ClassConstructorDescriptorImpl]

'annotationsFile' @ [88:38] ==> val annotationsFile: File? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.init[LocalVariableDescriptor]

'KotlinAnnotationProvider' @ [91:13] ==> public constructor KotlinAnnotationProvider() defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[ClassConstructorDescriptorImpl]

'processor' @ [94:9] ==> private final val processor: Processor defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'init' @ [94:19] ==> public abstract fun init(p0: (ProcessingEnvironment..ProcessingEnvironment?)): Unit defined in javax.annotation.processing.Processor[JavaMethodDescriptor]

'processingEnv' @ [94:24] ==> value-parameter processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.init[ValueParameterDescriptorImpl]

'handledAnnotationTypes' @ [96:9] ==> private final var handledAnnotationTypes: Set<String> defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'this' @ [96:34] ==> <this> defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[LazyClassReceiverParameterDescriptor]

'supportedAnnotationTypes' @ [96:39] ==> public final val AnnotationProcessorWrapper.supportedAnnotationTypes: MutableSet<String>[MyPropertyDescriptor]

'processor' @ [100:36] ==> private final val processor: Processor defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'supportedAnnotationTypes' @ [100:46] ==> public final val Processor.supportedAnnotationTypes: (MutableSet<(String..String?)>..Set<(String..String?)>?)[MyPropertyDescriptor]

'toMutableSet' @ [100:71] ==> public fun <T> Iterable<(String..String?)>.toMutableSet(): MutableSet<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'supportedAnnotations' @ [101:9] ==> val supportedAnnotations: MutableSet<(String..String?)> defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.getSupportedAnnotationTypes[LocalVariableDescriptor]

'add' @ [101:30] ==> public abstract fun add(element: (String..String?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'KAPT_SPECIAL_ANNOTATION' @ [101:34] ==> public final val KAPT_SPECIAL_ANNOTATION: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.Companion[PropertyDescriptorImpl]

'supportedAnnotations' @ [102:16] ==> val supportedAnnotations: MutableSet<(String..String?)> defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.getSupportedAnnotationTypes[LocalVariableDescriptor]

'processor' @ [106:16] ==> private final val processor: Processor defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'supportedSourceVersion' @ [106:26] ==> public final val Processor.supportedSourceVersion: (SourceVersion..SourceVersion?)[MyPropertyDescriptor]

'roundCounter' @ [110:9] ==> private final var roundCounter: Int defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'RoundEnvironmentWrapper' @ [112:39] ==> public constructor RoundEnvironmentWrapper(processingEnv: ProcessingEnvironment, parent: RoundEnvironment, roundNumber: Int, kotlinAnnotationsProvider: KotlinAnnotationProvider) defined in org.jetbrains.kotlin.annotation.RoundEnvironmentWrapper[ClassConstructorDescriptorImpl]

'processingEnv' @ [113:17] ==> private final var processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'roundEnv' @ [113:32] ==> value-parameter roundEnv: RoundEnvironment defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[ValueParameterDescriptorImpl]

'roundCounter' @ [113:42] ==> private final var roundCounter: Int defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'kotlinAnnotationsProvider' @ [113:56] ==> private final var kotlinAnnotationsProvider: KotlinAnnotationProvider defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'annotations' @ [115:34] ==> value-parameter annotations: Set<TypeElement>? defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[ValueParameterDescriptorImpl]

'toMutableSet' @ [115:47] ==> public fun <T> Iterable<TypeElement>.toMutableSet(): MutableSet<TypeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeElement

'hashSetOf' @ [115:65] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<TypeElement> /* = HashSet<TypeElement> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeElement

'wrappedAnnotations' @ [116:31] ==> val wrappedAnnotations: MutableSet<TypeElement> defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'mapTo' @ [116:50] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<TypeElement>.mapTo(destination: HashSet<String> /* = HashSet<String> */, transform: (TypeElement) -> String): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeElement
    <R> -> String
    <C : MutableCollection<in R>> -> HashSet<String>

'hashSetOf' @ [116:56] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [116:79] ==> value-parameter it: TypeElement defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [116:82] ==> public final val TypeElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [116:96] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'roundCounter' @ [118:13] ==> private final var roundCounter: Int defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'kotlinAnnotationsProvider' @ [119:38] ==> private final var kotlinAnnotationsProvider: KotlinAnnotationProvider defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'annotatedKotlinElements' @ [119:64] ==> public final val annotatedKotlinElements: Map<String, Set<AnnotatedElement>> defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[PropertyDescriptorImpl]

'keys' @ [119:88] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'annotationFqName' @ [120:21] ==> val annotationFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'existingFqNames' @ [120:41] ==> val existingFqNames: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'annotationFqName' @ [121:28] ==> val annotationFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'KAPT_SPECIAL_ANNOTATION' @ [121:48] ==> public final val KAPT_SPECIAL_ANNOTATION: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.Companion[PropertyDescriptorImpl]

'annotationFqName' @ [122:28] ==> val annotationFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'handledAnnotationTypes' @ [122:49] ==> private final var handledAnnotationTypes: Set<String> defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'existingFqNames' @ [124:17] ==> val existingFqNames: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'add' @ [124:33] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'annotationFqName' @ [124:37] ==> val annotationFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'processingEnv' @ [125:17] ==> private final var processingEnv: ProcessingEnvironment defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'elementUtils' @ [125:31] ==> public final val ProcessingEnvironment.elementUtils: (Elements..Elements?)[MyPropertyDescriptor]

'getTypeElement' @ [125:44] ==> public abstract fun getTypeElement(p0: (CharSequence..CharSequence?)): (TypeElement..TypeElement?) defined in javax.lang.model.util.Elements[JavaMethodDescriptor]

'annotationFqName' @ [125:59] ==> val annotationFqName: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'let' @ [125:78] ==> @InlineOnly public inline fun <T, R> TypeElement.let(block: (TypeElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeElement
    <R> -> Unit

'wrappedAnnotations' @ [125:84] ==> val wrappedAnnotations: MutableSet<TypeElement> defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'it' @ [125:106] ==> value-parameter it: TypeElement defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process.<anonymous>[ValueParameterDescriptorImpl]

'processor' @ [129:9] ==> private final val processor: Processor defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'process' @ [129:19] ==> public abstract fun process(p0: (MutableSet<out (TypeElement..TypeElement?)>..Set<(TypeElement..TypeElement?)>?), p1: (RoundEnvironment..RoundEnvironment?)): Boolean defined in javax.annotation.processing.Processor[JavaMethodDescriptor]

'wrappedAnnotations' @ [129:27] ==> val wrappedAnnotations: MutableSet<TypeElement> defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'roundEnvironmentWrapper' @ [129:47] ==> val roundEnvironmentWrapper: RoundEnvironmentWrapper defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.process[LocalVariableDescriptor]

'processor' @ [134:32] ==> private final val processor: Processor defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper[PropertyDescriptorImpl]

'supportedOptions' @ [134:42] ==> public final val Processor.supportedOptions: (MutableSet<(String..String?)>..Set<(String..String?)>?)[MyPropertyDescriptor]

'toHashSet' @ [134:59] ==> public fun <T> Iterable<(String..String?)>.toHashSet(): HashSet<(String..String?)> /* = HashSet<(String..String?)> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'supportedOptions' @ [135:9] ==> val supportedOptions: HashSet<(String..String?)> /* = HashSet<(String..String?)> */ defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.getSupportedOptions[LocalVariableDescriptor]

'add' @ [135:26] ==> public open fun add(element: (String..String?)): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'KAPT_ANNOTATION_OPTION' @ [135:30] ==> public final val KAPT_ANNOTATION_OPTION: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.Companion[PropertyDescriptorImpl]

'supportedOptions' @ [136:9] ==> val supportedOptions: HashSet<(String..String?)> /* = HashSet<(String..String?)> */ defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.getSupportedOptions[LocalVariableDescriptor]

'add' @ [136:26] ==> public open fun add(element: (String..String?)): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'KAPT_KOTLIN_GENERATED_OPTION' @ [136:30] ==> public final val KAPT_KOTLIN_GENERATED_OPTION: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.Companion[PropertyDescriptorImpl]

'supportedOptions' @ [137:16] ==> val supportedOptions: HashSet<(String..String?)> /* = HashSet<(String..String?)> */ defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.getSupportedOptions[LocalVariableDescriptor]

'messager' @ [141:9] ==> public final val ProcessingEnvironment.messager: (Messager..Messager?)[MyPropertyDescriptor]

'printMessage' @ [141:18] ==> public abstract fun printMessage(p0: (Diagnostic.Kind..Diagnostic.Kind?), p1: (CharSequence..CharSequence?)): Unit defined in javax.annotation.processing.Messager[JavaMethodDescriptor]

'ERROR' @ [141:47] ==> enum entry ERROR defined in javax.tools.Diagnostic.Kind[FakeCallableDescriptorForObject]

'message' @ [141:54] ==> value-parameter message: String defined in org.jetbrains.kotlin.annotation.AnnotationProcessorWrapper.err[ValueParameterDescriptorImpl]

