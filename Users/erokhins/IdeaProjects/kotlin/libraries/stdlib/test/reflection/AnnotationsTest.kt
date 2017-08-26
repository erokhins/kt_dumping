'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Suppress' @ [2:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Retention' @ [8:1] ==> public constructor Retention(value: AnnotationRetention = ...) defined in kotlin.annotation.Retention[DeserializedClassConstructorDescriptor]

'RUNTIME' @ [8:32] ==> enum entry RUNTIME defined in kotlin.annotation.AnnotationRetention[FakeCallableDescriptorForObject]

'MyAnno' @ [11:1] ==> public constructor MyAnno() defined in test.reflection.MyAnno[ClassConstructorDescriptorImpl]

'java.lang.Deprecated' @ [12:1] ==> public constructor Deprecated() defined in java.lang.Deprecated[JavaClassConstructorDescriptor]

'Test' @ [17:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'AnnotatedClass' @ [18:28] ==> public constructor AnnotatedClass() defined in test.reflection.AnnotatedClass[ClassConstructorDescriptorImpl]

'java' @ [18:50] ==> public val <T> KClass<AnnotatedClass>.java: Class<AnnotatedClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AnnotatedClass

'annotations' @ [18:55] ==> public final val <T : (Any..Any?)> Class<AnnotatedClass>.annotations: (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AnnotatedClass

'map' @ [18:67] ==> public inline fun <T, R> Array<out (Annotation..Annotation?)>.map(transform: ((Annotation..Annotation?)) -> KClass<out Annotation>): List<KClass<out Annotation>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Annotation..kotlin.Annotation?)
    <R> -> KClass<out Annotation>

'it' @ [18:73] ==> value-parameter it: (Annotation..Annotation?) defined in test.reflection.AnnotationTest.annotationType.<anonymous>[ValueParameterDescriptorImpl]

'annotationClass' @ [18:78] ==> public val <T : Annotation> Annotation.annotationClass: KClass<out Annotation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Annotation> -> Annotation

'AnnotatedClass' @ [19:28] ==> public constructor AnnotatedClass() defined in test.reflection.AnnotatedClass[ClassConstructorDescriptorImpl]

'java' @ [19:50] ==> public val <T> KClass<AnnotatedClass>.java: Class<AnnotatedClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AnnotatedClass

'annotations' @ [19:55] ==> public final val <T : (Any..Any?)> Class<AnnotatedClass>.annotations: (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AnnotatedClass

'map' @ [19:67] ==> public inline fun <T, R> Array<out (Annotation..Annotation?)>.map(transform: ((Annotation..Annotation?)) -> Class<out Annotation>): List<Class<out Annotation>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Annotation..kotlin.Annotation?)
    <R> -> Class<out Annotation>

'it' @ [19:73] ==> value-parameter it: (Annotation..Annotation?) defined in test.reflection.AnnotationTest.annotationType.<anonymous>[ValueParameterDescriptorImpl]

'annotationClass' @ [19:78] ==> public val <T : Annotation> Annotation.annotationClass: KClass<out Annotation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Annotation> -> Annotation

'java' @ [19:94] ==> public val <T> KClass<out Annotation>.java: Class<out Annotation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Annotation

'assertTrue' @ [21:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'kAnnotations' @ [21:20] ==> val kAnnotations: List<KClass<out Annotation>> defined in test.reflection.AnnotationTest.annotationType[LocalVariableDescriptor]

'containsAll' @ [21:33] ==> public abstract fun containsAll(elements: Collection<KClass<out Annotation>>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listOf' @ [21:45] ==> public fun <T> listOf(vararg elements: KClass<out Annotation>): List<KClass<out Annotation>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<out Annotation>

'MyAnno' @ [21:52] ==> public constructor MyAnno() defined in test.reflection.MyAnno[ClassConstructorDescriptorImpl]

'Deprecated' @ [21:83] ==> public constructor Deprecated() defined in java.lang.Deprecated[JavaClassConstructorDescriptor]

'assertTrue' @ [22:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'jAnnotations' @ [22:20] ==> val jAnnotations: List<Class<out Annotation>> defined in test.reflection.AnnotationTest.annotationType[LocalVariableDescriptor]

'containsAll' @ [22:33] ==> public abstract fun containsAll(elements: Collection<Class<out Annotation>>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listOf' @ [22:45] ==> public fun <T> listOf(vararg elements: Class<out Annotation>): List<Class<out Annotation>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out Annotation>

'MyAnno' @ [22:52] ==> public constructor MyAnno() defined in test.reflection.MyAnno[ClassConstructorDescriptorImpl]

'java' @ [22:66] ==> public val <T> KClass<MyAnno>.java: Class<MyAnno> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MyAnno

'Deprecated' @ [22:83] ==> public constructor Deprecated() defined in java.lang.Deprecated[JavaClassConstructorDescriptor]

'java' @ [22:101] ==> public val <T> KClass<Deprecated>.java: Class<Deprecated> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Deprecated

