'CustomSerializer.Proxy<Class<*>, ClassSerializer.ClassProxy>' @ [9:53] ==> public constructor Proxy<T, P>(clazz: Class<Class<*>>, proxyClass: Class<ClassSerializer.ClassProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Class<*>
    <P> -> ClassProxy

'Class' @ [9:114] ==> private constructor Class<T : (Any..Any?)>(p0: (ClassLoader..ClassLoader?)) defined in java.lang.Class[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@5afae577

'java' @ [9:127] ==> public val <T> KClass<Class<*>>.java: Class<Class<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Class<*>

'ClassProxy' @ [9:133] ==> public constructor ClassProxy(className: String) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ClassSerializer.ClassProxy[ClassConstructorDescriptorImpl]

'java' @ [9:151] ==> public val <T> KClass<ClassSerializer.ClassProxy>.java: Class<ClassSerializer.ClassProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassProxy

'factory' @ [9:157] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.ClassSerializer.<init>[ValueParameterDescriptorImpl]

'ClassProxy' @ [10:55] ==> public constructor ClassProxy(className: String) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ClassSerializer.ClassProxy[ClassConstructorDescriptorImpl]

'obj' @ [10:66] ==> value-parameter obj: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ClassSerializer.toProxy[ValueParameterDescriptorImpl]

'name' @ [10:70] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'forName' @ [12:65] ==> @CallerSensitive public open fun forName(p0: (String..String?), p1: Boolean, p2: (ClassLoader..ClassLoader?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'proxy' @ [12:73] ==> value-parameter proxy: ClassSerializer.ClassProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ClassSerializer.fromProxy[ValueParameterDescriptorImpl]

'className' @ [12:79] ==> public final val className: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.ClassSerializer.ClassProxy[PropertyDescriptorImpl]

'factory' @ [12:96] ==> protected final val factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.ClassSerializer[PropertyDescriptorImpl]

'classloader' @ [12:104] ==> public final val classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

