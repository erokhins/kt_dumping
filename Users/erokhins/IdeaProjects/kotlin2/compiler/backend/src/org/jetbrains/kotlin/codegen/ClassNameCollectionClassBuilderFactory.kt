'DelegatingClassBuilderFactory' @ [30:5] ==> public constructor DelegatingClassBuilderFactory(delegate: ClassBuilderFactory) defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilderFactory[ClassConstructorDescriptorImpl]

'delegate' @ [30:35] ==> value-parameter delegate: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.<init>[ValueParameterDescriptorImpl]

'ClassNameCollectionClassBuilder' @ [35:16] ==> public constructor ClassNameCollectionClassBuilder(classCreatedFor: JvmDeclarationOrigin, _delegate: ClassBuilder) defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder[ClassConstructorDescriptorImpl]

'origin' @ [35:48] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.newClassBuilder[ValueParameterDescriptorImpl]

'delegate' @ [35:56] ==> protected final val delegate: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory[PropertyDescriptorImpl]

'newClassBuilder' @ [35:65] ==> @NotNull public abstract fun newClassBuilder(@NotNull origin: JvmDeclarationOrigin): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassBuilderFactory[JavaMethodDescriptor]

'origin' @ [35:81] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.newClassBuilder[ValueParameterDescriptorImpl]

'DelegatingClassBuilder' @ [41:9] ==> public constructor DelegatingClassBuilder() defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaClassConstructorDescriptor]

'_delegate' @ [43:38] ==> internal final val _delegate: ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder[PropertyDescriptorImpl]

'classInternalName' @ [48:13] ==> private final lateinit var classInternalName: String defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder[PropertyDescriptorImpl]

'name' @ [48:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder.defineClass[ValueParameterDescriptorImpl]

'super' @ [49:13] ==> <this> defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder[LazyClassReceiverParameterDescriptor]

'defineClass' @ [49:19] ==> @Override public open fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [49:31] ==> value-parameter origin: PsiElement? defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder.defineClass[ValueParameterDescriptorImpl]

'version' @ [49:39] ==> value-parameter version: Int defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder.defineClass[ValueParameterDescriptorImpl]

'access' @ [49:48] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder.defineClass[ValueParameterDescriptorImpl]

'name' @ [49:56] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder.defineClass[ValueParameterDescriptorImpl]

'signature' @ [49:62] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder.defineClass[ValueParameterDescriptorImpl]

'superName' @ [49:73] ==> value-parameter superName: String defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder.defineClass[ValueParameterDescriptorImpl]

'interfaces' @ [49:84] ==> value-parameter interfaces: Array<out String> defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder.defineClass[ValueParameterDescriptorImpl]

'handleClashingNames' @ [53:13] ==> protected abstract fun handleClashingNames(internalName: String, origin: JvmDeclarationOrigin): Unit defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory[SimpleFunctionDescriptorImpl]

'classInternalName' @ [53:33] ==> private final lateinit var classInternalName: String defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder[PropertyDescriptorImpl]

'classCreatedFor' @ [53:52] ==> private final val classCreatedFor: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder[PropertyDescriptorImpl]

'super' @ [54:13] ==> <this> defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory.ClassNameCollectionClassBuilder[LazyClassReceiverParameterDescriptor]

'done' @ [54:19] ==> @Override public open fun done(): Unit defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

