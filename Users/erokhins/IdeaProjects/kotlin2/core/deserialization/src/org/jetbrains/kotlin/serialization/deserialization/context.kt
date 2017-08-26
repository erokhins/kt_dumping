'None' @ [46:103] ==> public object None : AdditionalClassPartsProvider defined in org.jetbrains.kotlin.descriptors.deserialization.AdditionalClassPartsProvider[FakeCallableDescriptorForObject]

'All' @ [47:121] ==> public object All : PlatformDependentDeclarationFilter defined in org.jetbrains.kotlin.descriptors.deserialization.PlatformDependentDeclarationFilter[FakeCallableDescriptorForObject]

'ClassDeserializer' @ [49:48] ==> public constructor ClassDeserializer(components: DeserializationComponents) defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[ClassConstructorDescriptorImpl]

'this' @ [49:66] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[LazyClassReceiverParameterDescriptor]

'classDeserializer' @ [51:64] ==> public final val classDeserializer: ClassDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'deserializeClass' @ [51:82] ==> public final fun deserializeClass(classId: ClassId, classDataWithSource: ClassDataWithSource? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[SimpleFunctionDescriptorImpl]

'classId' @ [51:99] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents.deserializeClass[ValueParameterDescriptorImpl]

'DeserializationContext' @ [60:13] ==> public constructor DeserializationContext(components: DeserializationComponents, nameResolver: NameResolver, containingDeclaration: DeclarationDescriptor, typeTable: TypeTable, sinceKotlinInfoTable: SinceKotlinInfoTable, containerSource: DeserializedContainerSource?, parentTypeDeserializer: TypeDeserializer?, typeParameters: List<ProtoBuf.TypeParameter>) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[ClassConstructorDescriptorImpl]

'this' @ [60:36] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[LazyClassReceiverParameterDescriptor]

'nameResolver' @ [60:42] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents.createContext[ValueParameterDescriptorImpl]

'descriptor' @ [60:56] ==> value-parameter descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents.createContext[ValueParameterDescriptorImpl]

'typeTable' @ [60:68] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents.createContext[ValueParameterDescriptorImpl]

'sinceKotlinInfoTable' @ [60:79] ==> value-parameter sinceKotlinInfoTable: SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents.createContext[ValueParameterDescriptorImpl]

'containerSource' @ [60:101] ==> value-parameter containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents.createContext[ValueParameterDescriptorImpl]

'listOf' @ [61:84] ==> @InlineOnly public inline fun <T> listOf(): List<ProtoBuf.TypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'TypeDeserializer' @ [75:28] ==> public constructor TypeDeserializer(c: DeserializationContext, parent: TypeDeserializer?, typeParameterProtos: List<ProtoBuf.TypeParameter>, debugName: String) defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[ClassConstructorDescriptorImpl]

'this' @ [75:45] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[LazyClassReceiverParameterDescriptor]

'parentTypeDeserializer' @ [75:51] ==> value-parameter parentTypeDeserializer: TypeDeserializer? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext.<init>[ValueParameterDescriptorImpl]

'typeParameters' @ [75:75] ==> value-parameter typeParameters: List<ProtoBuf.TypeParameter> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext.<init>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [76:65] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'name' @ [76:87] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'MemberDeserializer' @ [78:30] ==> public constructor MemberDeserializer(c: DeserializationContext) defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[ClassConstructorDescriptorImpl]

'this' @ [78:49] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[LazyClassReceiverParameterDescriptor]

'components' @ [80:48] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'storageManager' @ [80:59] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'this' @ [85:42] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[LazyClassReceiverParameterDescriptor]

'nameResolver' @ [85:47] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'this' @ [86:36] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[LazyClassReceiverParameterDescriptor]

'typeTable' @ [86:41] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'DeserializationContext' @ [87:9] ==> public constructor DeserializationContext(components: DeserializationComponents, nameResolver: NameResolver, containingDeclaration: DeclarationDescriptor, typeTable: TypeTable, sinceKotlinInfoTable: SinceKotlinInfoTable, containerSource: DeserializedContainerSource?, parentTypeDeserializer: TypeDeserializer?, typeParameters: List<ProtoBuf.TypeParameter>) defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[ClassConstructorDescriptorImpl]

'components' @ [88:13] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'nameResolver' @ [88:25] ==> value-parameter nameResolver: NameResolver = ... defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext.childContext[ValueParameterDescriptorImpl]

'descriptor' @ [88:39] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext.childContext[ValueParameterDescriptorImpl]

'typeTable' @ [88:51] ==> value-parameter typeTable: TypeTable = ... defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext.childContext[ValueParameterDescriptorImpl]

'sinceKotlinInfoTable' @ [88:62] ==> public final val sinceKotlinInfoTable: SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'this' @ [88:84] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[LazyClassReceiverParameterDescriptor]

'containerSource' @ [88:89] ==> public final val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'this' @ [89:38] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[LazyClassReceiverParameterDescriptor]

'typeDeserializer' @ [89:43] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'typeParameterProtos' @ [89:78] ==> value-parameter typeParameterProtos: List<ProtoBuf.TypeParameter> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext.childContext[ValueParameterDescriptorImpl]

