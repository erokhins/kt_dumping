'when (ktDeclaration) {
                is KtNamedFunction ->
                    FunctionGenerator(this).generateFunctionDeclaration(ktDeclaration)
                is KtProperty ->
                    PropertyGenerator(this).generatePropertyDeclaration(ktDeclaration)
                is KtClassOrObject ->
                    generateClassOrObjectDeclaration(ktDeclaration)
                is KtTypeAlias ->
                    generateTypeAliasDeclaration(ktDeclaration)
                else ->
                    IrErrorDeclarationImpl(
                            ktDeclaration.startOffset, ktDeclaration.endOffset,
                            getOrFail(BindingContext.DECLARATION_TO_DESCRIPTOR, ktDeclaration)
                    )
            }' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrDeclaration, entry1: IrDeclaration, entry2: IrDeclaration, entry3: IrDeclaration, entry4: IrDeclaration): IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrDeclaration

'ktDeclaration' @ [37:19] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration[ValueParameterDescriptorImpl]

'FunctionGenerator' @ [39:21] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'this' @ [39:39] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[LazyClassReceiverParameterDescriptor]

'generateFunctionDeclaration' @ [39:45] ==> public final fun generateFunctionDeclaration(ktFunction: KtNamedFunction): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [39:73] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration[ValueParameterDescriptorImpl]

'PropertyGenerator' @ [41:21] ==> public constructor PropertyGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[ClassConstructorDescriptorImpl]

'this' @ [41:39] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[LazyClassReceiverParameterDescriptor]

'generatePropertyDeclaration' @ [41:45] ==> public final fun generatePropertyDeclaration(ktProperty: KtProperty): IrProperty defined in org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [41:73] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration[ValueParameterDescriptorImpl]

'generateClassOrObjectDeclaration' @ [43:21] ==> public final fun generateClassOrObjectDeclaration(ktClassOrObject: KtClassOrObject): IrClass defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [43:54] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration[ValueParameterDescriptorImpl]

'generateTypeAliasDeclaration' @ [45:21] ==> public final fun generateTypeAliasDeclaration(ktDeclaration: KtTypeAlias): IrDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [45:50] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration[ValueParameterDescriptorImpl]

'IrErrorDeclarationImpl' @ [47:21] ==> public constructor IrErrorDeclarationImpl(startOffset: Int, endOffset: Int, descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrErrorDeclarationImpl[DeserializedClassConstructorDescriptor]

'ktDeclaration' @ [48:29] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration[ValueParameterDescriptorImpl]

'startOffset' @ [48:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDeclaration' @ [48:56] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration[ValueParameterDescriptorImpl]

'endOffset' @ [48:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'getOrFail' @ [49:29] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>, key: (PsiElement..PsiElement?)): (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'DECLARATION_TO_DESCRIPTOR' @ [49:54] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktDeclaration' @ [49:81] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration[ValueParameterDescriptorImpl]

'when (ktDeclaration) {
                is KtAnonymousInitializer ->
                    AnonymousInitializerGenerator(this).generateAnonymousInitializerDeclaration(ktDeclaration, classDescriptor)
                is KtSecondaryConstructor ->
                    FunctionGenerator(this).generateSecondaryConstructor(ktDeclaration)
                is KtEnumEntry ->
                    generateEnumEntryDeclaration(ktDeclaration)
                else ->
                    generateMemberDeclaration(ktDeclaration)
            }' @ [54:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrDeclaration, entry1: IrDeclaration, entry2: IrDeclaration, entry3: IrDeclaration): IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrDeclaration

'ktDeclaration' @ [54:19] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateClassMemberDeclaration[ValueParameterDescriptorImpl]

'AnonymousInitializerGenerator' @ [56:21] ==> public constructor AnonymousInitializerGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator[ClassConstructorDescriptorImpl]

'this' @ [56:51] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[LazyClassReceiverParameterDescriptor]

'generateAnonymousInitializerDeclaration' @ [56:57] ==> public final fun generateAnonymousInitializerDeclaration(ktAnonymousInitializer: KtAnonymousInitializer, classDescriptor: ClassDescriptor): IrDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.AnonymousInitializerGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [56:97] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateClassMemberDeclaration[ValueParameterDescriptorImpl]

'classDescriptor' @ [56:112] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateClassMemberDeclaration[ValueParameterDescriptorImpl]

'FunctionGenerator' @ [58:21] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'this' @ [58:39] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[LazyClassReceiverParameterDescriptor]

'generateSecondaryConstructor' @ [58:45] ==> public final fun generateSecondaryConstructor(ktConstructor: KtSecondaryConstructor): IrConstructor defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [58:74] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateClassMemberDeclaration[ValueParameterDescriptorImpl]

'generateEnumEntryDeclaration' @ [60:21] ==> private final fun generateEnumEntryDeclaration(ktEnumEntry: KtEnumEntry): IrEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [60:50] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateClassMemberDeclaration[ValueParameterDescriptorImpl]

'generateMemberDeclaration' @ [62:21] ==> public final fun generateMemberDeclaration(ktDeclaration: KtDeclaration): IrDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [62:47] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateClassMemberDeclaration[ValueParameterDescriptorImpl]

'ClassGenerator' @ [66:13] ==> public constructor ClassGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[ClassConstructorDescriptorImpl]

'this' @ [66:28] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[LazyClassReceiverParameterDescriptor]

'generateEnumEntry' @ [66:34] ==> public final fun generateEnumEntry(ktEnumEntry: KtEnumEntry): IrEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'ktEnumEntry' @ [66:52] ==> value-parameter ktEnumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateEnumEntryDeclaration[ValueParameterDescriptorImpl]

'ClassGenerator' @ [69:13] ==> public constructor ClassGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[ClassConstructorDescriptorImpl]

'this' @ [69:28] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[LazyClassReceiverParameterDescriptor]

'generateClass' @ [69:34] ==> public final fun generateClass(ktClassOrObject: KtClassOrObject): IrClass defined in org.jetbrains.kotlin.psi2ir.generators.ClassGenerator[SimpleFunctionDescriptorImpl]

'ktClassOrObject' @ [69:48] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateClassOrObjectDeclaration[ValueParameterDescriptorImpl]

'IrTypeAliasImpl' @ [72:13] ==> public constructor IrTypeAliasImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: TypeAliasDescriptor) defined in org.jetbrains.kotlin.ir.declarations.impl.IrTypeAliasImpl[DeserializedClassConstructorDescriptor]

'ktDeclaration' @ [72:29] ==> value-parameter ktDeclaration: KtTypeAlias defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeAliasDeclaration[ValueParameterDescriptorImpl]

'startOffset' @ [72:43] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktDeclaration' @ [72:56] ==> value-parameter ktDeclaration: KtTypeAlias defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeAliasDeclaration[ValueParameterDescriptorImpl]

'endOffset' @ [72:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'DEFINED' @ [72:101] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'getOrFail' @ [73:29] ==> public fun <K, V : Any> Generator.getOrFail(slice: ReadOnlySlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>, key: (PsiElement..PsiElement?)): (TypeAliasDescriptor..TypeAliasDescriptor?) defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : Any> -> (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?)

'TYPE_ALIAS' @ [73:54] ==> public final val TYPE_ALIAS: (WritableSlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktDeclaration' @ [73:66] ==> value-parameter ktDeclaration: KtTypeAlias defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeAliasDeclaration[ValueParameterDescriptorImpl]

'from' @ [80:9] ==> value-parameter from: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeParameterDeclarations[ValueParameterDescriptorImpl]

'mapTo' @ [80:14] ==> public inline fun <T, R, C : MutableCollection<in IrTypeParameter>> Iterable<TypeParameterDescriptor>.mapTo(destination: MutableList<IrTypeParameter>, transform: (TypeParameterDescriptor) -> IrTypeParameter): MutableList<IrTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> IrTypeParameter
    <C : MutableCollection<in R>> -> MutableList<IrTypeParameter>

'irTypeParametersOwner' @ [80:20] ==> value-parameter irTypeParametersOwner: IrTypeParametersContainer defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeParameterDeclarations[ValueParameterDescriptorImpl]

'typeParameters' @ [80:42] ==> public abstract val typeParameters: MutableList<IrTypeParameter> defined in org.jetbrains.kotlin.ir.declarations.IrTypeParametersContainer[DeserializedPropertyDescriptor]

'DescriptorToSourceUtils' @ [81:46] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [81:70] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'typeParameterDescriptor' @ [81:94] ==> value-parameter typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeParameterDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'ktTypeParameterDeclaration' @ [82:31] ==> val ktTypeParameterDeclaration: PsiElement? defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeParameterDeclarations.<anonymous>[LocalVariableDescriptor]

'startOffsetOrUndefined' @ [82:58] ==> public val PsiElement?.startOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'ktTypeParameterDeclaration' @ [83:29] ==> val ktTypeParameterDeclaration: PsiElement? defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeParameterDeclarations.<anonymous>[LocalVariableDescriptor]

'endOffsetOrUndefined' @ [83:56] ==> public val PsiElement?.endOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'context' @ [84:13] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[PropertyDescriptorImpl]

'symbolTable' @ [84:21] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareTypeParameter' @ [84:33] ==> public final fun declareTypeParameter(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: TypeParameterDescriptor): IrTypeParameter defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [84:54] ==> val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeParameterDeclarations.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [84:67] ==> val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeParameterDeclarations.<anonymous>[LocalVariableDescriptor]

'DEFINED' @ [84:98] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'typeParameterDescriptor' @ [84:107] ==> value-parameter typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateTypeParameterDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'createBodyGenerator' @ [89:13] ==> public fun Generator.createBodyGenerator(scopeOwnerSymbol: IrSymbol): BodyGenerator defined in org.jetbrains.kotlin.psi2ir.generators[SimpleFunctionDescriptorImpl]

'scopeOwnerSymbol' @ [89:33] ==> value-parameter scopeOwnerSymbol: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateInitializerBody[ValueParameterDescriptorImpl]

'generateExpressionBody' @ [89:51] ==> public final fun generateExpressionBody(ktExpression: KtExpression): IrExpressionBody defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[SimpleFunctionDescriptorImpl]

'ktBody' @ [89:74] ==> value-parameter ktBody: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateInitializerBody[ValueParameterDescriptorImpl]

'assert' @ [92:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'memberDescriptor' @ [92:16] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideDeclaration[ValueParameterDescriptorImpl]

'kind' @ [92:33] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [92:71] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'memberDescriptor' @ [93:39] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideDeclaration[ValueParameterDescriptorImpl]

'when (memberDescriptor) {
            is FunctionDescriptor ->
                generateFakeOverrideFunction(memberDescriptor, ktElement)
            is PropertyDescriptor ->
                generateFakeOverrideProperty(memberDescriptor, ktElement)
            else ->
                throw AssertionError("Unexpected member descriptor: $memberDescriptor")
        }' @ [95:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrDeclaration, entry1: IrDeclaration, entry2: IrDeclaration): IrDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrDeclaration

'memberDescriptor' @ [95:22] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideDeclaration[ValueParameterDescriptorImpl]

'generateFakeOverrideFunction' @ [97:17] ==> private final fun generateFakeOverrideFunction(functionDescriptor: FunctionDescriptor, ktElement: KtElement): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [97:46] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideDeclaration[ValueParameterDescriptorImpl]

'ktElement' @ [97:64] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideDeclaration[ValueParameterDescriptorImpl]

'generateFakeOverrideProperty' @ [99:17] ==> private final fun generateFakeOverrideProperty(propertyDescriptor: PropertyDescriptor, ktElement: KtElement): IrProperty defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [99:46] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideDeclaration[ValueParameterDescriptorImpl]

'ktElement' @ [99:64] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideDeclaration[ValueParameterDescriptorImpl]

'AssertionError' @ [101:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'memberDescriptor' @ [101:70] ==> value-parameter memberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideDeclaration[ValueParameterDescriptorImpl]

'IrPropertyImpl' @ [106:13] ==> public constructor IrPropertyImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, isDelegated: Boolean, descriptor: PropertyDescriptor, backingField: IrField?, getter: IrFunction?, setter: IrFunction?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrPropertyImpl[DeserializedClassConstructorDescriptor]

'ktElement' @ [107:21] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'startOffsetOrUndefined' @ [107:31] ==> public val PsiElement?.startOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'ktElement' @ [107:55] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'endOffsetOrUndefined' @ [107:65] ==> public val PsiElement?.endOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'FAKE_OVERRIDE' @ [108:41] ==> public object FAKE_OVERRIDE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'propertyDescriptor' @ [110:21] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'if (propertyDescriptor.getter == null)
                        context.symbolTable.declareField(
                                ktElement.startOffsetOrUndefined, ktElement.endOffsetOrUndefined, IrDeclarationOrigin.FAKE_OVERRIDE,
                                propertyDescriptor
                        )
                    else null' @ [111:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrField?, elseBranch: IrField?): IrField?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrField?

'propertyDescriptor' @ [111:25] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'getter' @ [111:44] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'context' @ [112:25] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[PropertyDescriptorImpl]

'symbolTable' @ [112:33] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'declareField' @ [112:45] ==> public final fun declareField(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: PropertyDescriptor): IrField defined in org.jetbrains.kotlin.ir.util.SymbolTable[DeserializedSimpleFunctionDescriptor]

'ktElement' @ [113:33] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'startOffsetOrUndefined' @ [113:43] ==> public val PsiElement?.startOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'ktElement' @ [113:67] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'endOffsetOrUndefined' @ [113:77] ==> public val PsiElement?.endOffsetOrUndefined: Int defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[PropertyDescriptorImpl]

'FAKE_OVERRIDE' @ [113:119] ==> public object FAKE_OVERRIDE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'propertyDescriptor' @ [114:33] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [117:21] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'getter' @ [117:40] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [117:48] ==> @InlineOnly public inline fun <T, R> PropertyGetterDescriptor.let(block: (PropertyGetterDescriptor) -> IrFunction): IrFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptor
    <R> -> IrFunction

'generateFakeOverrideFunction' @ [117:54] ==> private final fun generateFakeOverrideFunction(functionDescriptor: FunctionDescriptor, ktElement: KtElement): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'it' @ [117:83] ==> value-parameter it: PropertyGetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty.<anonymous>[ValueParameterDescriptorImpl]

'ktElement' @ [117:87] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [118:21] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'setter' @ [118:40] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [118:48] ==> @InlineOnly public inline fun <T, R> PropertySetterDescriptor.let(block: (PropertySetterDescriptor) -> IrFunction): IrFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptor
    <R> -> IrFunction

'generateFakeOverrideFunction' @ [118:54] ==> private final fun generateFakeOverrideFunction(functionDescriptor: FunctionDescriptor, ktElement: KtElement): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[SimpleFunctionDescriptorImpl]

'it' @ [118:83] ==> value-parameter it: PropertySetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty.<anonymous>[ValueParameterDescriptorImpl]

'ktElement' @ [118:87] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideProperty[ValueParameterDescriptorImpl]

'FunctionGenerator' @ [122:13] ==> public constructor FunctionGenerator(declarationGenerator: DeclarationGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[ClassConstructorDescriptorImpl]

'this' @ [122:31] ==> <this> defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[LazyClassReceiverParameterDescriptor]

'generateFakeOverrideFunction' @ [122:37] ==> public final fun generateFakeOverrideFunction(functionDescriptor: FunctionDescriptor, ktElement: KtElement): IrFunction defined in org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [122:66] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideFunction[ValueParameterDescriptorImpl]

'ktElement' @ [122:86] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateFakeOverrideFunction[ValueParameterDescriptorImpl]

'declarationGenerator' @ [126:52] ==> public final val declarationGenerator: DeclarationGenerator defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension[PropertyDescriptorImpl]

'context' @ [126:73] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator[PropertyDescriptorImpl]

'also' @ [129:13] ==> @InlineOnly @SinceKotlin public inline fun <T> T.also(block: (T) -> Unit): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'context' @ [130:17] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension[PropertyDescriptorImpl]

'symbolTable' @ [130:25] ==> public final val symbolTable: SymbolTable defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'withScope' @ [130:37] ==> public inline fun <T> SymbolTable.withScope(owner: DeclarationDescriptor, block: () -> Unit): Unit defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'irDeclaration' @ [130:47] ==> value-parameter irDeclaration: T defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension.buildWithScope.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [130:61] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrDeclaration[DeserializedPropertyDescriptor]

'invoke' @ [131:21] ==> public abstract operator fun invoke(p1: T): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'irDeclaration' @ [131:29] ==> value-parameter irDeclaration: T defined in org.jetbrains.kotlin.psi2ir.generators.DeclarationGeneratorExtension.buildWithScope.<anonymous>[ValueParameterDescriptorImpl]

'BodyGenerator' @ [137:9] ==> public constructor BodyGenerator(scopeOwnerSymbol: IrSymbol, context: GeneratorContext) defined in org.jetbrains.kotlin.psi2ir.generators.BodyGenerator[ClassConstructorDescriptorImpl]

'scopeOwnerSymbol' @ [137:23] ==> value-parameter scopeOwnerSymbol: IrSymbol defined in org.jetbrains.kotlin.psi2ir.generators.createBodyGenerator[ValueParameterDescriptorImpl]

'context' @ [137:41] ==> public abstract val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.Generator[PropertyDescriptorImpl]

