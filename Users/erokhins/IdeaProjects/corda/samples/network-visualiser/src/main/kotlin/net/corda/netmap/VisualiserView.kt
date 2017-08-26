'Label' @ [39:21] ==> public constructor Label(p0: (String..String?)) defined in javafx.scene.control.Label[JavaClassConstructorDescriptor]

'Button' @ [41:22] ==> public constructor Button(p0: (String..String?)) defined in javafx.scene.control.Button[JavaClassConstructorDescriptor]

'apply' @ [41:34] ==> @InlineOnly public inline fun <T> Button.apply(block: Button.() -> Unit): Button defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Button

'styleClass' @ [41:42] ==> public final val Button.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'ImageView' @ [45:20] ==> public constructor ImageView(p0: (Image..Image?)) defined in javafx.scene.image.ImageView[JavaClassConstructorDescriptor]

'Image' @ [45:30] ==> public constructor Image(@NamedArg p0: (InputStream..InputStream?)) defined in javafx.scene.image.Image[JavaClassConstructorDescriptor]

'NetworkMapVisualiser' @ [45:36] ==> public constructor NetworkMapVisualiser() defined in net.corda.netmap.NetworkMapVisualiser[ClassConstructorDescriptorImpl]

'java' @ [45:64] ==> public val <T> KClass<NetworkMapVisualiser>.java: Class<NetworkMapVisualiser> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NetworkMapVisualiser

'getResourceAsStream' @ [45:69] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.Class[JavaMethodDescriptor]

'mapImage' @ [47:34] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'image' @ [47:43] ==> public final var ImageView.image: (Image..Image?)[MyPropertyDescriptor]

'pixelReader' @ [47:49] ==> public final val Image.pixelReader: (PixelReader..PixelReader?)[MyPropertyDescriptor]

'getColor' @ [47:61] ==> public abstract fun getColor(p0: Int, p1: Int): (Color..Color?) defined in javafx.scene.image.PixelReader[JavaMethodDescriptor]

'NetworkMapVisualiser' @ [62:9] ==> public constructor NetworkMapVisualiser() defined in net.corda.netmap.NetworkMapVisualiser[ClassConstructorDescriptorImpl]

'java' @ [62:37] ==> public val <T> KClass<NetworkMapVisualiser>.java: Class<NetworkMapVisualiser> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NetworkMapVisualiser

'getResourceAsStream' @ [62:42] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.Class[JavaMethodDescriptor]

'use' @ [62:91] ==> @InlineOnly public inline fun <T : Closeable?, R> (InputStream..InputStream?).use(block: ((InputStream..InputStream?)) -> (Font..Font?)): (Font..Font?) defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.io.InputStream..java.io.InputStream?)
    <R> -> (javafx.scene.text.Font..javafx.scene.text.Font?)

'loadFont' @ [63:18] ==> public open fun loadFont(p0: (InputStream..InputStream?), p1: Double): (Font..Font?) defined in javafx.scene.text.Font[JavaMethodDescriptor]

'it' @ [63:27] ==> value-parameter it: (InputStream..InputStream?) defined in net.corda.netmap.VisualiserView.setup.<anonymous>[ValueParameterDescriptorImpl]

'displayStyle' @ [65:13] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.setup[ValueParameterDescriptorImpl]

'MAP' @ [65:35] ==> enum entry MAP defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

'mapImage' @ [66:13] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'onZoom' @ [66:22] ==> public final var ImageView.onZoom: (EventHandler<in (ZoomEvent..ZoomEvent?)>..EventHandler<in (ZoomEvent..ZoomEvent?)>?)[MyPropertyDescriptor]

'EventHandler' @ [66:31] ==> @FunctionalInterface public fun <T : (Event..Event?)> EventHandler(function: ((ZoomEvent..ZoomEvent?)) -> Unit): EventHandler<ZoomEvent> defined in javafx.event[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Event..Event?)> -> ZoomEvent

'event' @ [67:17] ==> value-parameter event: (ZoomEvent..ZoomEvent?) defined in net.corda.netmap.VisualiserView.setup.<anonymous>[ValueParameterDescriptorImpl]

'consume' @ [67:23] ==> public open fun consume(): Unit defined in javafx.scene.input.ZoomEvent[JavaMethodDescriptor]

'mapImage' @ [68:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitWidth' @ [68:26] ==> public final var ImageView.fitWidth: Double[MyPropertyDescriptor]

'mapImage' @ [68:37] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitWidth' @ [68:46] ==> public final var ImageView.fitWidth: Double[MyPropertyDescriptor]

'event' @ [68:57] ==> value-parameter event: (ZoomEvent..ZoomEvent?) defined in net.corda.netmap.VisualiserView.setup.<anonymous>[ValueParameterDescriptorImpl]

'zoomFactor' @ [68:63] ==> public final val ZoomEvent.zoomFactor: Double[MyPropertyDescriptor]

'mapImage' @ [69:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitHeight' @ [69:26] ==> public final var ImageView.fitHeight: Double[MyPropertyDescriptor]

'mapImage' @ [69:38] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitHeight' @ [69:47] ==> public final var ImageView.fitHeight: Double[MyPropertyDescriptor]

'event' @ [69:59] ==> value-parameter event: (ZoomEvent..ZoomEvent?) defined in net.corda.netmap.VisualiserView.setup.<anonymous>[ValueParameterDescriptorImpl]

'zoomFactor' @ [69:65] ==> public final val ZoomEvent.zoomFactor: Double[MyPropertyDescriptor]

'scaleMap' @ [73:9] ==> public final fun scaleMap(displayStyle: VisualiserViewModel.Style): Unit defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'displayStyle' @ [73:18] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.setup[ValueParameterDescriptorImpl]

'root' @ [74:9] ==> public final lateinit var root: Pane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'Pane' @ [74:16] ==> public constructor Pane(vararg p0: (Node..Node?)) defined in javafx.scene.layout.Pane[JavaClassConstructorDescriptor]

'mapImage' @ [74:21] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'root' @ [75:9] ==> public final lateinit var root: Pane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'background' @ [75:14] ==> public final var Pane.background: (Background..Background?)[MyPropertyDescriptor]

'Background' @ [75:27] ==> public constructor Background(@NamedArg vararg p0: (BackgroundFill..BackgroundFill?)) defined in javafx.scene.layout.Background[JavaClassConstructorDescriptor]

'BackgroundFill' @ [75:38] ==> public constructor BackgroundFill(@NamedArg p0: (Paint..Paint?), @NamedArg p1: (CornerRadii..CornerRadii?), @NamedArg p2: (Insets..Insets?)) defined in javafx.scene.layout.BackgroundFill[JavaClassConstructorDescriptor]

'backgroundColor' @ [75:53] ==> public final val backgroundColor: Color defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'EMPTY' @ [75:82] ==> public final val EMPTY: (CornerRadii..CornerRadii?) defined in javafx.scene.layout.CornerRadii[JavaPropertyDescriptor]

'EMPTY' @ [75:96] ==> public final val EMPTY: (Insets..Insets?) defined in javafx.geometry.Insets[JavaPropertyDescriptor]

'scrollPane' @ [76:9] ==> public final var scrollPane: ScrollPane? defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'buildScrollPane' @ [76:22] ==> public final fun buildScrollPane(backgroundColor: Color, displayStyle: VisualiserViewModel.Style): ScrollPane defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'backgroundColor' @ [76:38] ==> public final val backgroundColor: Color defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'displayStyle' @ [76:55] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.setup[ValueParameterDescriptorImpl]

'makeTopBar' @ [78:20] ==> public final fun makeTopBar(runningPausedState: NetworkMapVisualiser.RunningPausedState, displayStyle: VisualiserViewModel.Style, presentationMode: Boolean): VBox defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'runningPausedState' @ [78:31] ==> value-parameter runningPausedState: NetworkMapVisualiser.RunningPausedState defined in net.corda.netmap.VisualiserView.setup[ValueParameterDescriptorImpl]

'displayStyle' @ [78:51] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.setup[ValueParameterDescriptorImpl]

'presentationMode' @ [78:65] ==> value-parameter presentationMode: Boolean defined in net.corda.netmap.VisualiserView.setup[ValueParameterDescriptorImpl]

'setAlignment' @ [79:19] ==> public open fun setAlignment(p0: (Node..Node?), p1: (Pos..Pos?)): Unit defined in javafx.scene.layout.StackPane[JavaMethodDescriptor]

'vbox' @ [79:32] ==> val vbox: VBox defined in net.corda.netmap.VisualiserView.setup[LocalVariableDescriptor]

'TOP_CENTER' @ [79:42] ==> enum entry TOP_CENTER defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'splitter' @ [83:9] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'SplitPane' @ [83:20] ==> public constructor SplitPane(vararg p0: (Node..Node?)) defined in javafx.scene.control.SplitPane[JavaClassConstructorDescriptor]

'makeSidebar' @ [83:30] ==> public final fun makeSidebar(): Node defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'scrollPane' @ [83:45] ==> public final var scrollPane: ScrollPane? defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'splitter' @ [84:9] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'styleClass' @ [84:18] ==> public final val SplitPane.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'runLater' @ [85:18] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'splitter' @ [86:13] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'dividers' @ [86:22] ==> public final val SplitPane.dividers: (ObservableList<(SplitPane.Divider..SplitPane.Divider?)>..ObservableList<(SplitPane.Divider..SplitPane.Divider?)>?)[MyPropertyDescriptor]

'position' @ [86:34] ==> public final var SplitPane.Divider.position: Double[MyPropertyDescriptor]

'defaultSplitterPosition' @ [86:45] ==> val defaultSplitterPosition: Double defined in net.corda.netmap.VisualiserView.setup[LocalVariableDescriptor]

'setVgrow' @ [88:14] ==> public open fun setVgrow(p0: (Node..Node?), p1: (Priority..Priority?)): Unit defined in javafx.scene.layout.VBox[JavaMethodDescriptor]

'splitter' @ [88:23] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'ALWAYS' @ [88:42] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'hideButton' @ [91:9] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'makeHideButton' @ [91:22] ==> public final fun makeHideButton(defaultSplitterPosition: Double): Button defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'defaultSplitterPosition' @ [91:37] ==> val defaultSplitterPosition: Double defined in net.corda.netmap.VisualiserView.setup[LocalVariableDescriptor]

'VBox' @ [93:27] ==> public constructor VBox(vararg p0: (Node..Node?)) defined in javafx.scene.layout.VBox[JavaClassConstructorDescriptor]

'vbox' @ [93:32] ==> val vbox: VBox defined in net.corda.netmap.VisualiserView.setup[LocalVariableDescriptor]

'StackPane' @ [93:38] ==> public constructor StackPane(vararg p0: (Node..Node?)) defined in javafx.scene.layout.StackPane[JavaClassConstructorDescriptor]

'splitter' @ [93:48] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'hideButton' @ [93:58] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'screenStack' @ [94:9] ==> val screenStack: VBox defined in net.corda.netmap.VisualiserView.setup[LocalVariableDescriptor]

'styleClass' @ [94:21] ==> public final val VBox.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'stage' @ [95:9] ==> public final lateinit var stage: Stage defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'scene' @ [95:15] ==> public final var Stage.scene: (Scene..Scene?)[MyPropertyDescriptor]

'Scene' @ [95:23] ==> public constructor Scene(@NamedArg p0: (Parent..Parent?), @NamedArg p1: (Paint..Paint?)) defined in javafx.scene.Scene[JavaClassConstructorDescriptor]

'screenStack' @ [95:29] ==> val screenStack: VBox defined in net.corda.netmap.VisualiserView.setup[LocalVariableDescriptor]

'backgroundColor' @ [95:42] ==> public final val backgroundColor: Color defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'stage' @ [96:9] ==> public final lateinit var stage: Stage defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'width' @ [96:15] ==> public final var Stage.width: Double[MyPropertyDescriptor]

'stage' @ [97:9] ==> public final lateinit var stage: Stage defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'height' @ [97:15] ==> public final var Stage.height: Double[MyPropertyDescriptor]

'when (displayStyle) {
            Style.MAP -> {
                mapImage.fitWidth = bitmapWidth * defaultZoom
                mapImage.fitHeight = bitmapHeight * defaultZoom
                mapImage.onZoom = EventHandler<ZoomEvent> { event ->
                    event.consume()
                    mapImage.fitWidth = mapImage.fitWidth * event.zoomFactor
                    mapImage.fitHeight = mapImage.fitHeight * event.zoomFactor
                }
            }
            Style.CIRCLE -> {
                val scaleRatio = Math.min(stageWidth / bitmapWidth, stageHeight / bitmapHeight)
                mapImage.fitWidth = bitmapWidth * scaleRatio
                mapImage.fitHeight = bitmapHeight * scaleRatio
            }
        }' @ [101:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'displayStyle' @ [101:15] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.buildScrollPane[ValueParameterDescriptorImpl]

'MAP' @ [102:19] ==> enum entry MAP defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

'mapImage' @ [103:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitWidth' @ [103:26] ==> public final var ImageView.fitWidth: Double[MyPropertyDescriptor]

'bitmapWidth' @ [103:37] ==> public final val bitmapWidth: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'defaultZoom' @ [103:51] ==> public final var defaultZoom: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'mapImage' @ [104:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitHeight' @ [104:26] ==> public final var ImageView.fitHeight: Double[MyPropertyDescriptor]

'bitmapHeight' @ [104:38] ==> public final val bitmapHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'defaultZoom' @ [104:53] ==> public final var defaultZoom: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'mapImage' @ [105:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'onZoom' @ [105:26] ==> public final var ImageView.onZoom: (EventHandler<in (ZoomEvent..ZoomEvent?)>..EventHandler<in (ZoomEvent..ZoomEvent?)>?)[MyPropertyDescriptor]

'EventHandler' @ [105:35] ==> @FunctionalInterface public fun <T : (Event..Event?)> EventHandler(function: ((ZoomEvent..ZoomEvent?)) -> Unit): EventHandler<ZoomEvent> defined in javafx.event[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Event..Event?)> -> ZoomEvent

'event' @ [106:21] ==> value-parameter event: (ZoomEvent..ZoomEvent?) defined in net.corda.netmap.VisualiserView.buildScrollPane.<anonymous>[ValueParameterDescriptorImpl]

'consume' @ [106:27] ==> public open fun consume(): Unit defined in javafx.scene.input.ZoomEvent[JavaMethodDescriptor]

'mapImage' @ [107:21] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitWidth' @ [107:30] ==> public final var ImageView.fitWidth: Double[MyPropertyDescriptor]

'mapImage' @ [107:41] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitWidth' @ [107:50] ==> public final var ImageView.fitWidth: Double[MyPropertyDescriptor]

'event' @ [107:61] ==> value-parameter event: (ZoomEvent..ZoomEvent?) defined in net.corda.netmap.VisualiserView.buildScrollPane.<anonymous>[ValueParameterDescriptorImpl]

'zoomFactor' @ [107:67] ==> public final val ZoomEvent.zoomFactor: Double[MyPropertyDescriptor]

'mapImage' @ [108:21] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitHeight' @ [108:30] ==> public final var ImageView.fitHeight: Double[MyPropertyDescriptor]

'mapImage' @ [108:42] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitHeight' @ [108:51] ==> public final var ImageView.fitHeight: Double[MyPropertyDescriptor]

'event' @ [108:63] ==> value-parameter event: (ZoomEvent..ZoomEvent?) defined in net.corda.netmap.VisualiserView.buildScrollPane.<anonymous>[ValueParameterDescriptorImpl]

'zoomFactor' @ [108:69] ==> public final val ZoomEvent.zoomFactor: Double[MyPropertyDescriptor]

'CIRCLE' @ [111:19] ==> enum entry CIRCLE defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

'min' @ [112:39] ==> public open fun min(p0: Double, p1: Double): Double defined in java.lang.Math[JavaMethodDescriptor]

'stageWidth' @ [112:43] ==> public final val stageWidth: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'bitmapWidth' @ [112:56] ==> public final val bitmapWidth: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'stageHeight' @ [112:69] ==> public final val stageHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'bitmapHeight' @ [112:83] ==> public final val bitmapHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'mapImage' @ [113:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitWidth' @ [113:26] ==> public final var ImageView.fitWidth: Double[MyPropertyDescriptor]

'bitmapWidth' @ [113:37] ==> public final val bitmapWidth: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'scaleRatio' @ [113:51] ==> val scaleRatio: Double defined in net.corda.netmap.VisualiserView.buildScrollPane[LocalVariableDescriptor]

'mapImage' @ [114:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitHeight' @ [114:26] ==> public final var ImageView.fitHeight: Double[MyPropertyDescriptor]

'bitmapHeight' @ [114:38] ==> public final val bitmapHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'scaleRatio' @ [114:53] ==> val scaleRatio: Double defined in net.corda.netmap.VisualiserView.buildScrollPane[LocalVariableDescriptor]

'ScrollPane' @ [118:16] ==> public constructor ScrollPane(p0: (Node..Node?)) defined in javafx.scene.control.ScrollPane[JavaClassConstructorDescriptor]

'Group' @ [118:27] ==> public constructor Group(vararg p0: (Node..Node?)) defined in javafx.scene.Group[JavaClassConstructorDescriptor]

'root' @ [118:33] ==> public final lateinit var root: Pane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'apply' @ [118:40] ==> @InlineOnly public inline fun <T> ScrollPane.apply(block: ScrollPane.() -> Unit): ScrollPane defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScrollPane

'when (displayStyle) {
                Style.MAP -> {
                    hvalue = 0.4
                    vvalue = 0.7
                }
                Style.CIRCLE -> {
                    hvalue = 0.0
                    vvalue = 0.0
                }
            }' @ [119:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'displayStyle' @ [119:19] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.buildScrollPane[ValueParameterDescriptorImpl]

'MAP' @ [120:23] ==> enum entry MAP defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

'hvalue' @ [121:21] ==> public final var ScrollPane.hvalue: Double[MyPropertyDescriptor]

'vvalue' @ [122:21] ==> public final var ScrollPane.vvalue: Double[MyPropertyDescriptor]

'CIRCLE' @ [124:23] ==> enum entry CIRCLE defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

'hvalue' @ [125:21] ==> public final var ScrollPane.hvalue: Double[MyPropertyDescriptor]

'vvalue' @ [126:21] ==> public final var ScrollPane.vvalue: Double[MyPropertyDescriptor]

'hbarPolicy' @ [129:13] ==> public final var ScrollPane.hbarPolicy: (ScrollPane.ScrollBarPolicy..ScrollPane.ScrollBarPolicy?)[MyPropertyDescriptor]

'NEVER' @ [129:53] ==> enum entry NEVER defined in javafx.scene.control.ScrollPane.ScrollBarPolicy[FakeCallableDescriptorForObject]

'vbarPolicy' @ [130:13] ==> public final var ScrollPane.vbarPolicy: (ScrollPane.ScrollBarPolicy..ScrollPane.ScrollBarPolicy?)[MyPropertyDescriptor]

'NEVER' @ [130:53] ==> enum entry NEVER defined in javafx.scene.control.ScrollPane.ScrollBarPolicy[FakeCallableDescriptorForObject]

'isPannable' @ [131:13] ==> public final var ScrollPane.isPannable: Boolean[MyPropertyDescriptor]

'isFocusTraversable' @ [132:13] ==> public final var ScrollPane.isFocusTraversable: Boolean[MyPropertyDescriptor]

'style' @ [133:13] ==> public final var ScrollPane.style: (String..String?)[MyPropertyDescriptor]

'+' @ [133:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'colorToRgb' @ [133:48] ==> internal fun colorToRgb(color: Color): String defined in net.corda.netmap in file VisualiserUtils.kt[SimpleFunctionDescriptorImpl]

'backgroundColor' @ [133:59] ==> value-parameter backgroundColor: Color defined in net.corda.netmap.VisualiserView.buildScrollPane[ValueParameterDescriptorImpl]

'styleClass' @ [134:13] ==> public final val ScrollPane.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'hideButton' @ [141:9] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isFocusTraversable' @ [141:20] ==> public final var Button.isFocusTraversable: Boolean[MyPropertyDescriptor]

'hideButton' @ [142:9] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'setOnAction' @ [142:20] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'if (!hideButtonToggled) {
                hideButton.translateXProperty().unbind()
                Timeline(
                        KeyFrame(Duration.millis(500.0),
                                splitter.dividers[0].positionProperty().keyValue(0.0),
                                hideButton.translateXProperty().keyValue(0.0),
                                hideButton.rotateProperty().keyValue(180.0)
                        )
                ).play()
            } else {
                bindHideButtonPosition()
                Timeline(
                        KeyFrame(Duration.millis(500.0),
                                splitter.dividers[0].positionProperty().keyValue(defaultSplitterPosition),
                                hideButton.rotateProperty().keyValue(0.0)
                        )
                ).play()
            }' @ [143:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [143:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hideButtonToggled' @ [143:18] ==> var hideButtonToggled: Boolean defined in net.corda.netmap.VisualiserView.makeHideButton[LocalVariableDescriptor]

'hideButton' @ [144:17] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'translateXProperty' @ [144:28] ==> public final fun translateXProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'unbind' @ [144:49] ==> public abstract fun unbind(): Unit defined in javafx.beans.property.DoubleProperty[JavaMethodDescriptor]

'Timeline' @ [145:17] ==> public constructor Timeline(vararg p0: (KeyFrame..KeyFrame?)) defined in javafx.animation.Timeline[JavaClassConstructorDescriptor]

'KeyFrame' @ [146:25] ==> public constructor KeyFrame(@NamedArg p0: (Duration..Duration?), @NamedArg vararg p1: (KeyValue..KeyValue?)) defined in javafx.animation.KeyFrame[JavaClassConstructorDescriptor]

'millis' @ [146:43] ==> public open fun millis(p0: Double): (Duration..Duration?) defined in javafx.util.Duration[JavaMethodDescriptor]

'splitter' @ [147:33] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'dividers' @ [147:42] ==> public final val SplitPane.dividers: (ObservableList<(SplitPane.Divider..SplitPane.Divider?)>..ObservableList<(SplitPane.Divider..SplitPane.Divider?)>?)[MyPropertyDescriptor]

'positionProperty' @ [147:54] ==> public final fun positionProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.SplitPane.Divider[JavaMethodDescriptor]

'keyValue' @ [147:73] ==> public fun <T : Any> WritableValue<(Number..Number?)>.keyValue(endValue: (Number..Number?), interpolator: Interpolator = ...): KeyValue defined in net.corda.netmap[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Number..kotlin.Number?)

'hideButton' @ [148:33] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'translateXProperty' @ [148:44] ==> public final fun translateXProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'keyValue' @ [148:65] ==> public fun <T : Any> WritableValue<(Number..Number?)>.keyValue(endValue: (Number..Number?), interpolator: Interpolator = ...): KeyValue defined in net.corda.netmap[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Number..kotlin.Number?)

'hideButton' @ [149:33] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'rotateProperty' @ [149:44] ==> public final fun rotateProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'keyValue' @ [149:61] ==> public fun <T : Any> WritableValue<(Number..Number?)>.keyValue(endValue: (Number..Number?), interpolator: Interpolator = ...): KeyValue defined in net.corda.netmap[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Number..kotlin.Number?)

'play' @ [151:19] ==> public open fun play(): Unit defined in javafx.animation.Timeline[JavaMethodDescriptor]

'bindHideButtonPosition' @ [153:17] ==> public final fun bindHideButtonPosition(): Unit defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'Timeline' @ [154:17] ==> public constructor Timeline(vararg p0: (KeyFrame..KeyFrame?)) defined in javafx.animation.Timeline[JavaClassConstructorDescriptor]

'KeyFrame' @ [155:25] ==> public constructor KeyFrame(@NamedArg p0: (Duration..Duration?), @NamedArg vararg p1: (KeyValue..KeyValue?)) defined in javafx.animation.KeyFrame[JavaClassConstructorDescriptor]

'millis' @ [155:43] ==> public open fun millis(p0: Double): (Duration..Duration?) defined in javafx.util.Duration[JavaMethodDescriptor]

'splitter' @ [156:33] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'dividers' @ [156:42] ==> public final val SplitPane.dividers: (ObservableList<(SplitPane.Divider..SplitPane.Divider?)>..ObservableList<(SplitPane.Divider..SplitPane.Divider?)>?)[MyPropertyDescriptor]

'positionProperty' @ [156:54] ==> public final fun positionProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.SplitPane.Divider[JavaMethodDescriptor]

'keyValue' @ [156:73] ==> public fun <T : Any> WritableValue<(Number..Number?)>.keyValue(endValue: (Number..Number?), interpolator: Interpolator = ...): KeyValue defined in net.corda.netmap[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Number..kotlin.Number?)

'defaultSplitterPosition' @ [156:82] ==> value-parameter defaultSplitterPosition: Double defined in net.corda.netmap.VisualiserView.makeHideButton[ValueParameterDescriptorImpl]

'hideButton' @ [157:33] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'rotateProperty' @ [157:44] ==> public final fun rotateProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'keyValue' @ [157:61] ==> public fun <T : Any> WritableValue<(Number..Number?)>.keyValue(endValue: (Number..Number?), interpolator: Interpolator = ...): KeyValue defined in net.corda.netmap[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Number..kotlin.Number?)

'play' @ [159:19] ==> public open fun play(): Unit defined in javafx.animation.Timeline[JavaMethodDescriptor]

'hideButtonToggled' @ [161:13] ==> var hideButtonToggled: Boolean defined in net.corda.netmap.VisualiserView.makeHideButton[LocalVariableDescriptor]

'!' @ [161:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hideButtonToggled' @ [161:34] ==> var hideButtonToggled: Boolean defined in net.corda.netmap.VisualiserView.makeHideButton[LocalVariableDescriptor]

'bindHideButtonPosition' @ [163:9] ==> public final fun bindHideButtonPosition(): Unit defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'setAlignment' @ [164:19] ==> public open fun setAlignment(p0: (Node..Node?), p1: (Pos..Pos?)): Unit defined in javafx.scene.layout.StackPane[JavaMethodDescriptor]

'hideButton' @ [164:32] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'TOP_LEFT' @ [164:48] ==> enum entry TOP_LEFT defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'hideButton' @ [165:16] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'hideButton' @ [169:9] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'translateXProperty' @ [169:20] ==> public final fun translateXProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'unbind' @ [169:41] ==> public abstract fun unbind(): Unit defined in javafx.beans.property.DoubleProperty[JavaMethodDescriptor]

'hideButton' @ [170:9] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'translateXProperty' @ [170:20] ==> public final fun translateXProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'bind' @ [170:41] ==> public abstract fun bind(p0: (ObservableValue<out (Number..Number?)>..ObservableValue<out (Number..Number?)>?)): Unit defined in javafx.beans.property.DoubleProperty[JavaMethodDescriptor]

'splitter' @ [170:46] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'dividers' @ [170:55] ==> public final val SplitPane.dividers: (ObservableList<(SplitPane.Divider..SplitPane.Divider?)>..ObservableList<(SplitPane.Divider..SplitPane.Divider?)>?)[MyPropertyDescriptor]

'positionProperty' @ [170:67] ==> public final fun positionProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.SplitPane.Divider[JavaMethodDescriptor]

'multiply' @ [170:86] ==> public open fun multiply(p0: (ObservableNumberValue..ObservableNumberValue?)): (DoubleBinding..DoubleBinding?) defined in javafx.beans.property.DoubleProperty[JavaMethodDescriptor]

'splitter' @ [170:95] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'widthProperty' @ [170:104] ==> public final fun widthProperty(): (ReadOnlyDoubleProperty..ReadOnlyDoubleProperty?) defined in javafx.scene.control.SplitPane[JavaMethodDescriptor]

'subtract' @ [170:121] ==> public open fun subtract(p0: (ObservableNumberValue..ObservableNumberValue?)): (DoubleBinding..DoubleBinding?) defined in javafx.beans.binding.DoubleBinding[JavaMethodDescriptor]

'hideButton' @ [170:130] ==> public final var hideButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'widthProperty' @ [170:141] ==> public final fun widthProperty(): (ReadOnlyDoubleProperty..ReadOnlyDoubleProperty?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'when (displayStyle) {
            Style.MAP -> {
                mapImage.fitWidth = bitmapWidth * defaultZoom
                mapImage.fitHeight = bitmapHeight * defaultZoom
            }
            Style.CIRCLE -> {
                val scaleRatio = Math.min(stageWidth / bitmapWidth, stageHeight / bitmapHeight)
                mapImage.fitWidth = bitmapWidth * scaleRatio
                mapImage.fitHeight = bitmapHeight * scaleRatio
            }
        }' @ [174:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'displayStyle' @ [174:15] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.scaleMap[ValueParameterDescriptorImpl]

'MAP' @ [175:19] ==> enum entry MAP defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

'mapImage' @ [176:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitWidth' @ [176:26] ==> public final var ImageView.fitWidth: Double[MyPropertyDescriptor]

'bitmapWidth' @ [176:37] ==> public final val bitmapWidth: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'defaultZoom' @ [176:51] ==> public final var defaultZoom: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'mapImage' @ [177:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitHeight' @ [177:26] ==> public final var ImageView.fitHeight: Double[MyPropertyDescriptor]

'bitmapHeight' @ [177:38] ==> public final val bitmapHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'defaultZoom' @ [177:53] ==> public final var defaultZoom: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'CIRCLE' @ [179:19] ==> enum entry CIRCLE defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

'min' @ [180:39] ==> public open fun min(p0: Double, p1: Double): Double defined in java.lang.Math[JavaMethodDescriptor]

'stageWidth' @ [180:43] ==> public final val stageWidth: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'bitmapWidth' @ [180:56] ==> public final val bitmapWidth: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'stageHeight' @ [180:69] ==> public final val stageHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'bitmapHeight' @ [180:83] ==> public final val bitmapHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'mapImage' @ [181:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitWidth' @ [181:26] ==> public final var ImageView.fitWidth: Double[MyPropertyDescriptor]

'bitmapWidth' @ [181:37] ==> public final val bitmapWidth: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'scaleRatio' @ [181:51] ==> val scaleRatio: Double defined in net.corda.netmap.VisualiserView.scaleMap[LocalVariableDescriptor]

'mapImage' @ [182:17] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'fitHeight' @ [182:26] ==> public final var ImageView.fitHeight: Double[MyPropertyDescriptor]

'bitmapHeight' @ [182:38] ==> public final val bitmapHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'scaleRatio' @ [182:53] ==> val scaleRatio: Double defined in net.corda.netmap.VisualiserView.scaleMap[LocalVariableDescriptor]

'sidebar' @ [188:9] ==> public final lateinit var sidebar: VBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'VBox' @ [188:19] ==> public constructor VBox() defined in javafx.scene.layout.VBox[JavaClassConstructorDescriptor]

'sidebar' @ [189:9] ==> public final lateinit var sidebar: VBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'styleClass' @ [189:17] ==> public final val VBox.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'sidebar' @ [190:9] ==> public final lateinit var sidebar: VBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isFillWidth' @ [190:17] ==> public final var VBox.isFillWidth: Boolean[MyPropertyDescriptor]

'ScrollPane' @ [191:18] ==> public constructor ScrollPane(p0: (Node..Node?)) defined in javafx.scene.control.ScrollPane[JavaClassConstructorDescriptor]

'sidebar' @ [191:29] ==> public final lateinit var sidebar: VBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'sp' @ [192:9] ==> val sp: ScrollPane defined in net.corda.netmap.VisualiserView.makeSidebar[LocalVariableDescriptor]

'isFitToWidth' @ [192:12] ==> public final var ScrollPane.isFitToWidth: Boolean[MyPropertyDescriptor]

'sp' @ [193:9] ==> val sp: ScrollPane defined in net.corda.netmap.VisualiserView.makeSidebar[LocalVariableDescriptor]

'isFitToHeight' @ [193:12] ==> public final var ScrollPane.isFitToHeight: Boolean[MyPropertyDescriptor]

'sp' @ [194:9] ==> val sp: ScrollPane defined in net.corda.netmap.VisualiserView.makeSidebar[LocalVariableDescriptor]

'styleClass' @ [194:12] ==> public final val ScrollPane.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'sp' @ [195:9] ==> val sp: ScrollPane defined in net.corda.netmap.VisualiserView.makeSidebar[LocalVariableDescriptor]

'hbarPolicy' @ [195:12] ==> public final var ScrollPane.hbarPolicy: (ScrollPane.ScrollBarPolicy..ScrollPane.ScrollBarPolicy?)[MyPropertyDescriptor]

'NEVER' @ [195:52] ==> enum entry NEVER defined in javafx.scene.control.ScrollPane.ScrollBarPolicy[FakeCallableDescriptorForObject]

'sp' @ [196:9] ==> val sp: ScrollPane defined in net.corda.netmap.VisualiserView.makeSidebar[LocalVariableDescriptor]

'vbarPolicy' @ [196:12] ==> public final var ScrollPane.vbarPolicy: (ScrollPane.ScrollBarPolicy..ScrollPane.ScrollBarPolicy?)[MyPropertyDescriptor]

'NEVER' @ [196:52] ==> enum entry NEVER defined in javafx.scene.control.ScrollPane.ScrollBarPolicy[FakeCallableDescriptorForObject]

'sp' @ [197:9] ==> val sp: ScrollPane defined in net.corda.netmap.VisualiserView.makeSidebar[LocalVariableDescriptor]

'minWidth' @ [197:12] ==> public final var ScrollPane.minWidth: Double[MyPropertyDescriptor]

'sp' @ [198:16] ==> val sp: ScrollPane defined in net.corda.netmap.VisualiserView.makeSidebar[LocalVariableDescriptor]

'nextButton' @ [204:9] ==> public final lateinit var nextButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'Button' @ [204:22] ==> public constructor Button(p0: (String..String?)) defined in javafx.scene.control.Button[JavaClassConstructorDescriptor]

'apply' @ [204:37] ==> @InlineOnly public inline fun <T> Button.apply(block: Button.() -> Unit): Button defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Button

'styleClass' @ [205:13] ==> public final val Button.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'styleClass' @ [206:13] ==> public final val Button.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'runPauseButton' @ [208:9] ==> public final lateinit var runPauseButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'Button' @ [208:26] ==> public constructor Button(p0: (String..String?)) defined in javafx.scene.control.Button[JavaClassConstructorDescriptor]

'runningPausedState' @ [208:33] ==> value-parameter runningPausedState: NetworkMapVisualiser.RunningPausedState defined in net.corda.netmap.VisualiserView.makeTopBar[ValueParameterDescriptorImpl]

'buttonLabel' @ [208:52] ==> public final val buttonLabel: NetworkMapVisualiser.RunPauseButtonLabel defined in net.corda.netmap.NetworkMapVisualiser.RunningPausedState[PropertyDescriptorImpl]

'toString' @ [208:64] ==> public open fun toString(): String defined in net.corda.netmap.NetworkMapVisualiser.RunPauseButtonLabel[SimpleFunctionDescriptorImpl]

'apply' @ [208:76] ==> @InlineOnly public inline fun <T> Button.apply(block: Button.() -> Unit): Button defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Button

'styleClass' @ [209:13] ==> public final val Button.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'styleClass' @ [210:13] ==> public final val Button.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'simulateInitialisationCheckbox' @ [212:9] ==> public final lateinit var simulateInitialisationCheckbox: CheckBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'CheckBox' @ [212:42] ==> public constructor CheckBox(p0: (String..String?)) defined in javafx.scene.control.CheckBox[JavaClassConstructorDescriptor]

'resetButton' @ [213:9] ==> public final lateinit var resetButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'Button' @ [213:23] ==> public constructor Button(p0: (String..String?)) defined in javafx.scene.control.Button[JavaClassConstructorDescriptor]

'apply' @ [213:39] ==> @InlineOnly public inline fun <T> Button.apply(block: Button.() -> Unit): Button defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Button

'styleClass' @ [214:13] ==> public final val Button.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'styleClass' @ [215:13] ==> public final val Button.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'observableArrayList' @ [218:43] ==> public open fun <E : (Any..Any?)> observableArrayList(): (ObservableList<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>..ObservableList<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Style

'values' @ [219:15] ==> public final fun values(): Array<VisualiserViewModel.Style> defined in net.corda.netmap.VisualiserViewModel.Style[SimpleFunctionDescriptorImpl]

'forEach' @ [219:24] ==> public inline fun <T> Array<out VisualiserViewModel.Style>.forEach(action: (VisualiserViewModel.Style) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Style

'displayStyles' @ [219:34] ==> val displayStyles: (ObservableList<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>..ObservableList<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>?) defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'add' @ [219:48] ==> public abstract fun add(element: (VisualiserViewModel.Style..VisualiserViewModel.Style?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'it' @ [219:52] ==> value-parameter it: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.makeTopBar.<anonymous>[ValueParameterDescriptorImpl]

'styleChoice' @ [221:9] ==> public final lateinit var styleChoice: ChoiceBox<VisualiserViewModel.Style> defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'ChoiceBox' @ [221:23] ==> public constructor ChoiceBox<T : (Any..Any?)>(p0: (ObservableList<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>..ObservableList<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>?)) defined in javafx.scene.control.ChoiceBox[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.netmap.VisualiserViewModel.Style..net.corda.netmap.VisualiserViewModel.Style?)

'displayStyles' @ [221:33] ==> val displayStyles: (ObservableList<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>..ObservableList<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>?) defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'apply' @ [221:48] ==> @InlineOnly public inline fun <T> ChoiceBox<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>.apply(block: ChoiceBox<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>.() -> Unit): ChoiceBox<(VisualiserViewModel.Style..VisualiserViewModel.Style?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ChoiceBox<(net.corda.netmap.VisualiserViewModel.Style..net.corda.netmap.VisualiserViewModel.Style?)>

'styleClass' @ [222:13] ==> public final val <T : (Any..Any?)> ChoiceBox<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.netmap.VisualiserViewModel.Style..net.corda.netmap.VisualiserViewModel.Style?)

'styleClass' @ [223:13] ==> public final val <T : (Any..Any?)> ChoiceBox<(VisualiserViewModel.Style..VisualiserViewModel.Style?)>.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.netmap.VisualiserViewModel.Style..net.corda.netmap.VisualiserViewModel.Style?)

'styleChoice' @ [225:9] ==> public final lateinit var styleChoice: ChoiceBox<VisualiserViewModel.Style> defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'value' @ [225:21] ==> public final var <T : (Any..Any?)> ChoiceBox<VisualiserViewModel.Style>.value: (VisualiserViewModel.Style..VisualiserViewModel.Style?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Style

'displayStyle' @ [225:29] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.makeTopBar[ValueParameterDescriptorImpl]

'Pane' @ [227:26] ==> public constructor Pane() defined in javafx.scene.layout.Pane[JavaClassConstructorDescriptor]

'apply' @ [227:33] ==> @InlineOnly public inline fun <T> Pane.apply(block: Pane.() -> Unit): Pane defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pane

'styleClass' @ [227:41] ==> public final val Pane.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'minHeight' @ [227:86] ==> public final var Pane.minHeight: Double[MyPropertyDescriptor]

'ImageView' @ [228:25] ==> public constructor ImageView(p0: (String..String?)) defined in javafx.scene.image.ImageView[JavaClassConstructorDescriptor]

'javaClass' @ [228:35] ==> public val <T : Any> VisualiserView.javaClass: Class<VisualiserView> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> VisualiserView

'getResource' @ [228:45] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.Class[JavaMethodDescriptor]

'toExternalForm' @ [228:75] ==> public open fun toExternalForm(): (String..String?) defined in java.net.URL[JavaMethodDescriptor]

'logoImage' @ [229:9] ==> val logoImage: ImageView defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'fitHeight' @ [229:19] ==> public final var ImageView.fitHeight: Double[MyPropertyDescriptor]

'logoImage' @ [230:9] ==> val logoImage: ImageView defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'isPreserveRatio' @ [230:19] ==> public final var ImageView.isPreserveRatio: Boolean[MyPropertyDescriptor]

'HBox' @ [231:25] ==> public constructor HBox(vararg p0: (Node..Node?)) defined in javafx.scene.layout.HBox[JavaClassConstructorDescriptor]

'logoImage' @ [231:30] ==> val logoImage: ImageView defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'Label' @ [232:17] ==> public constructor Label(p0: (String..String?)) defined in javafx.scene.control.Label[JavaClassConstructorDescriptor]

'apply' @ [232:44] ==> @InlineOnly public inline fun <T> Label.apply(block: Label.() -> Unit): Label defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'styleClass' @ [232:52] ==> public final val Label.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'logoLabel' @ [234:9] ==> val logoLabel: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'spacing' @ [234:19] ==> public final var HBox.spacing: Double[MyPropertyDescriptor]

'logoLabel' @ [235:9] ==> val logoLabel: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'alignment' @ [235:19] ==> public final var HBox.alignment: (Pos..Pos?)[MyPropertyDescriptor]

'CENTER_LEFT' @ [235:35] ==> enum entry CENTER_LEFT defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'setHgrow' @ [236:14] ==> public open fun setHgrow(p0: (Node..Node?), p1: (Priority..Priority?)): Unit defined in javafx.scene.layout.HBox[JavaMethodDescriptor]

'logoLabel' @ [236:23] ==> val logoLabel: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'ALWAYS' @ [236:43] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'logoLabel' @ [237:9] ==> val logoLabel: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'setPrefSize' @ [237:19] ==> public open fun setPrefSize(p0: Double, p1: Double): Unit defined in javafx.scene.layout.HBox[JavaMethodDescriptor]

'USE_COMPUTED_SIZE' @ [237:38] ==> public const final val USE_COMPUTED_SIZE: Double defined in javafx.scene.layout.Region[JavaPropertyDescriptor]

'USE_PREF_SIZE' @ [237:64] ==> public const final val USE_PREF_SIZE: Double defined in javafx.scene.layout.Region[JavaPropertyDescriptor]

'dateLabel' @ [238:9] ==> public final var dateLabel: Label defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'Label' @ [238:21] ==> public constructor Label(p0: (String..String?)) defined in javafx.scene.control.Label[JavaClassConstructorDescriptor]

'apply' @ [238:31] ==> @InlineOnly public inline fun <T> Label.apply(block: Label.() -> Unit): Label defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'styleClass' @ [238:39] ==> public final val Label.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'if (presentationMode) {
            HBox(logoLabel, dateLabel).apply { styleClass += "controls-hbox" }
        } else {
            HBox(logoLabel, dateLabel, simulateInitialisationCheckbox, runPauseButton, nextButton, resetButton, styleChoice).apply { styleClass += "controls-hbox" }
        }' @ [241:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HBox, elseBranch: HBox): HBox[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HBox

'presentationMode' @ [241:24] ==> value-parameter presentationMode: Boolean defined in net.corda.netmap.VisualiserView.makeTopBar[ValueParameterDescriptorImpl]

'HBox' @ [242:13] ==> public constructor HBox(vararg p0: (Node..Node?)) defined in javafx.scene.layout.HBox[JavaClassConstructorDescriptor]

'logoLabel' @ [242:18] ==> val logoLabel: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'dateLabel' @ [242:29] ==> public final var dateLabel: Label defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'apply' @ [242:40] ==> @InlineOnly public inline fun <T> HBox.apply(block: HBox.() -> Unit): HBox defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HBox

'styleClass' @ [242:48] ==> public final val HBox.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'HBox' @ [244:13] ==> public constructor HBox(vararg p0: (Node..Node?)) defined in javafx.scene.layout.HBox[JavaClassConstructorDescriptor]

'logoLabel' @ [244:18] ==> val logoLabel: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'dateLabel' @ [244:29] ==> public final var dateLabel: Label defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'simulateInitialisationCheckbox' @ [244:40] ==> public final lateinit var simulateInitialisationCheckbox: CheckBox defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'runPauseButton' @ [244:72] ==> public final lateinit var runPauseButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'nextButton' @ [244:88] ==> public final lateinit var nextButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'resetButton' @ [244:100] ==> public final lateinit var resetButton: Button defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'styleChoice' @ [244:113] ==> public final lateinit var styleChoice: ChoiceBox<VisualiserViewModel.Style> defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'apply' @ [244:126] ==> @InlineOnly public inline fun <T> HBox.apply(block: HBox.() -> Unit): HBox defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HBox

'styleClass' @ [244:134] ==> public final val HBox.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'hbox' @ [246:9] ==> val hbox: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'styleClass' @ [246:14] ==> public final val HBox.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'hbox' @ [247:9] ==> val hbox: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'spacing' @ [247:14] ==> public final var HBox.spacing: Double[MyPropertyDescriptor]

'hbox' @ [248:9] ==> val hbox: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'alignment' @ [248:14] ==> public final var HBox.alignment: (Pos..Pos?)[MyPropertyDescriptor]

'CENTER_RIGHT' @ [248:30] ==> enum entry CENTER_RIGHT defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'hbox' @ [249:9] ==> val hbox: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'padding' @ [249:14] ==> public final var HBox.padding: (Insets..Insets?)[MyPropertyDescriptor]

'Insets' @ [249:24] ==> public constructor Insets(@NamedArg p0: Double, @NamedArg p1: Double, @NamedArg p2: Double, @NamedArg p3: Double) defined in javafx.geometry.Insets[JavaClassConstructorDescriptor]

'VBox' @ [250:20] ==> public constructor VBox(vararg p0: (Node..Node?)) defined in javafx.scene.layout.VBox[JavaClassConstructorDescriptor]

'hbox' @ [250:25] ==> val hbox: HBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'dropShadow' @ [250:31] ==> val dropShadow: Pane defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'vbox' @ [251:9] ==> val vbox: VBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'styleClass' @ [251:14] ==> public final val VBox.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'vbox' @ [252:9] ==> val vbox: VBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'setPrefSize' @ [252:14] ==> public open fun setPrefSize(p0: Double, p1: Double): Unit defined in javafx.scene.layout.VBox[JavaMethodDescriptor]

'USE_COMPUTED_SIZE' @ [252:33] ==> public const final val USE_COMPUTED_SIZE: Double defined in javafx.scene.layout.Region[JavaPropertyDescriptor]

'USE_COMPUTED_SIZE' @ [252:59] ==> public const final val USE_COMPUTED_SIZE: Double defined in javafx.scene.layout.Region[JavaPropertyDescriptor]

'vbox' @ [253:9] ==> val vbox: VBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'setMaxSize' @ [253:14] ==> public open fun setMaxSize(p0: Double, p1: Double): Unit defined in javafx.scene.layout.VBox[JavaMethodDescriptor]

'USE_COMPUTED_SIZE' @ [253:32] ==> public const final val USE_COMPUTED_SIZE: Double defined in javafx.scene.layout.Region[JavaPropertyDescriptor]

'USE_PREF_SIZE' @ [253:58] ==> public const final val USE_PREF_SIZE: Double defined in javafx.scene.layout.Region[JavaPropertyDescriptor]

'vbox' @ [254:16] ==> val vbox: VBox defined in net.corda.netmap.VisualiserView.makeTopBar[LocalVariableDescriptor]

'tracker' @ [259:63] ==> value-parameter tracker: ProgressTracker defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[ValueParameterDescriptorImpl]

'allSteps' @ [259:71] ==> public final val allSteps: List<Pair<Int, ProgressTracker.Step>> defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'VBox' @ [260:24] ==> public constructor VBox() defined in javafx.scene.layout.VBox[JavaClassConstructorDescriptor]

'apply' @ [260:31] ==> @InlineOnly public inline fun <T> VBox.apply(block: VBox.() -> Unit): VBox defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VBox

'styleClass' @ [261:13] ==> public final val VBox.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'component1' @ [263:15] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [263:23] ==> public final operator fun component2(): ProgressTracker.Step defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'allSteps' @ [263:32] ==> val allSteps: List<Pair<Int, ProgressTracker.Step>> defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'Label' @ [264:29] ==> public constructor Label(p0: (String..String?)) defined in javafx.scene.control.Label[JavaClassConstructorDescriptor]

'step' @ [264:35] ==> val step: ProgressTracker.Step defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'label' @ [264:40] ==> public open val label: String defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedPropertyDescriptor]

'apply' @ [264:47] ==> @InlineOnly public inline fun <T> Label.apply(block: Label.() -> Unit): Label defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'padding' @ [264:55] ==> public final var Label.padding: (Insets..Insets?)[MyPropertyDescriptor]

'Insets' @ [264:65] ==> public constructor Insets(@NamedArg p0: Double, @NamedArg p1: Double, @NamedArg p2: Double, @NamedArg p3: Double) defined in javafx.geometry.Insets[JavaClassConstructorDescriptor]

'indent' @ [264:87] ==> val indent: Int defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'stepsBox' @ [265:13] ==> val stepsBox: VBox defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'children' @ [265:22] ==> public final val VBox.children: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'StackPane' @ [265:34] ==> public constructor StackPane(vararg p0: (Node..Node?)) defined in javafx.scene.layout.StackPane[JavaClassConstructorDescriptor]

'stepLabel' @ [265:44] ==> val stepLabel: Label defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'tracker' @ [267:34] ==> value-parameter tracker: ProgressTracker defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[ValueParameterDescriptorImpl]

'currentStepRecursive' @ [267:42] ==> public final val currentStepRecursive: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'allSteps' @ [268:23] ==> val allSteps: List<Pair<Int, ProgressTracker.Step>> defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'indexOfFirst' @ [268:32] ==> public inline fun <T> List<Pair<Int, ProgressTracker.Step>>.indexOfFirst(predicate: (Pair<Int, ProgressTracker.Step>) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Step>

'it' @ [268:47] ==> value-parameter it: Pair<Int, ProgressTracker.Step> defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [268:50] ==> public final val second: ProgressTracker.Step defined in kotlin.Pair[DeserializedPropertyDescriptor]

'trackerCurrentStep' @ [268:60] ==> val trackerCurrentStep: ProgressTracker.Step defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'Polygon' @ [270:22] ==> public constructor Polygon(vararg p0: Double) defined in javafx.scene.shape.Polygon[JavaClassConstructorDescriptor]

'-' @ [270:30] ==> public final operator fun unaryMinus(): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'arrowSize' @ [270:31] ==> val arrowSize: Double defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'-' @ [270:42] ==> public final operator fun unaryMinus(): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'arrowSize' @ [270:43] ==> val arrowSize: Double defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'arrowSize' @ [270:54] ==> val arrowSize: Double defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'-' @ [270:70] ==> public final operator fun unaryMinus(): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'arrowSize' @ [270:71] ==> val arrowSize: Double defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'arrowSize' @ [270:82] ==> val arrowSize: Double defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'apply' @ [270:93] ==> @InlineOnly public inline fun <T> Polygon.apply(block: Polygon.() -> Unit): Polygon defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Polygon

'styleClass' @ [271:13] ==> public final val Polygon.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'translateY' @ [272:13] ==> public final var Polygon.translateY: Double[MyPropertyDescriptor]

'+' @ [272:26] ==> public final operator fun plus(other: Double): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'*' @ [272:27] ==> public final operator fun times(other: Double): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'max' @ [272:32] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'curStep' @ [272:39] ==> val curStep: Int defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'sideBarStepHeight' @ [272:54] ==> public final val sideBarStepHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'sideBarStepHeight' @ [272:76] ==> public final val sideBarStepHeight: Double defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'Pane' @ [274:25] ==> public constructor Pane(vararg p0: (Node..Node?)) defined in javafx.scene.layout.Pane[JavaClassConstructorDescriptor]

'cursor' @ [274:30] ==> val cursor: Polygon defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'apply' @ [274:38] ==> @InlineOnly public inline fun <T> Pane.apply(block: Pane.() -> Unit): Pane defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pane

'styleClass' @ [275:13] ==> public final val Pane.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'minWidth' @ [276:13] ==> public final var Pane.minWidth: Double[MyPropertyDescriptor]

'setHgrow' @ [279:14] ==> public open fun setHgrow(p0: (Node..Node?), p1: (Priority..Priority?)): Unit defined in javafx.scene.layout.HBox[JavaMethodDescriptor]

'stepsBox' @ [279:23] ==> val stepsBox: VBox defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'ALWAYS' @ [279:42] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'HBox' @ [280:23] ==> public constructor HBox(vararg p0: (Node..Node?)) defined in javafx.scene.layout.HBox[JavaClassConstructorDescriptor]

'cursorBox' @ [280:28] ==> val cursorBox: Pane defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'stepsBox' @ [280:39] ==> val stepsBox: VBox defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'Label' @ [282:21] ==> public constructor Label(p0: (String..String?)) defined in javafx.scene.control.Label[JavaClassConstructorDescriptor]

'label' @ [282:27] ==> value-parameter label: String defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[ValueParameterDescriptorImpl]

'apply' @ [282:34] ==> @InlineOnly public inline fun <T> Label.apply(block: Label.() -> Unit): Label defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'styleClass' @ [282:42] ==> public final val Label.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'setAlignment' @ [283:19] ==> public open fun setAlignment(p0: (Node..Node?), p1: (Pos..Pos?)): Unit defined in javafx.scene.layout.StackPane[JavaMethodDescriptor]

'title' @ [283:32] ==> val title: Label defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'CENTER_LEFT' @ [283:43] ==> enum entry CENTER_LEFT defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'vbox' @ [284:9] ==> val vbox: VBox? defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'VBox' @ [284:16] ==> public constructor VBox(vararg p0: (Node..Node?)) defined in javafx.scene.layout.VBox[JavaClassConstructorDescriptor]

'StackPane' @ [284:21] ==> public constructor StackPane(vararg p0: (Node..Node?)) defined in javafx.scene.layout.StackPane[JavaClassConstructorDescriptor]

'title' @ [284:31] ==> val title: Label defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'content' @ [284:39] ==> val content: HBox defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'vbox' @ [285:9] ==> val vbox: VBox? defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'padding' @ [285:14] ==> public final var VBox.padding: (Insets..Insets?)[MyPropertyDescriptor]

'Insets' @ [285:24] ==> public constructor Insets(@NamedArg p0: Double, @NamedArg p1: Double, @NamedArg p2: Double, @NamedArg p3: Double) defined in javafx.geometry.Insets[JavaClassConstructorDescriptor]

'TrackerWidget' @ [286:16] ==> public constructor TrackerWidget(vbox: VBox, cursorBox: Pane, label: Label, cursor: Polygon) defined in net.corda.netmap.TrackerWidget[ClassConstructorDescriptorImpl]

'vbox' @ [286:30] ==> val vbox: VBox? defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'cursorBox' @ [286:36] ==> val cursorBox: Pane defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'title' @ [286:47] ==> val title: Label defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'cursor' @ [286:54] ==> val cursor: Polygon defined in net.corda.netmap.VisualiserView.buildProgressTrackerWidget[LocalVariableDescriptor]

'requireNotNull' @ [294:9] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SplitPane?): SplitPane defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SplitPane

'splitter' @ [294:24] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'splitter' @ [295:9] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'items' @ [295:18] ==> public final val SplitPane.items: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'remove' @ [295:24] ==> public abstract fun remove(element: (Node..Node?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'scrollPane' @ [295:31] ==> public final var scrollPane: ScrollPane? defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'scrollPane' @ [296:9] ==> public final var scrollPane: ScrollPane? defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'buildScrollPane' @ [296:22] ==> public final fun buildScrollPane(backgroundColor: Color, displayStyle: VisualiserViewModel.Style): ScrollPane defined in net.corda.netmap.VisualiserView[SimpleFunctionDescriptorImpl]

'backgroundColor' @ [296:38] ==> public final val backgroundColor: Color defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'displayStyle' @ [296:55] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.updateDisplayStyle[ValueParameterDescriptorImpl]

'splitter' @ [297:9] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'items' @ [297:18] ==> public final val SplitPane.items: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'add' @ [297:24] ==> public abstract fun add(element: (Node..Node?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'scrollPane' @ [297:28] ==> public final var scrollPane: ScrollPane? defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'splitter' @ [298:9] ==> public final lateinit var splitter: SplitPane defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'dividers' @ [298:18] ==> public final val SplitPane.dividers: (ObservableList<(SplitPane.Divider..SplitPane.Divider?)>..ObservableList<(SplitPane.Divider..SplitPane.Divider?)>?)[MyPropertyDescriptor]

'position' @ [298:30] ==> public final var SplitPane.Divider.position: Double[MyPropertyDescriptor]

'mapImage' @ [299:9] ==> public final val mapImage: ImageView defined in net.corda.netmap.VisualiserView[PropertyDescriptorImpl]

'isVisible' @ [299:18] ==> public final var ImageView.isVisible: Boolean[MyPropertyDescriptor]

'when (displayStyle) {
            Style.MAP -> true
            Style.CIRCLE -> false
        }' @ [299:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'displayStyle' @ [299:36] ==> value-parameter displayStyle: VisualiserViewModel.Style defined in net.corda.netmap.VisualiserView.updateDisplayStyle[ValueParameterDescriptorImpl]

'MAP' @ [300:19] ==> enum entry MAP defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

'CIRCLE' @ [301:19] ==> enum entry CIRCLE defined in net.corda.netmap.VisualiserViewModel.Style[FakeCallableDescriptorForObject]

