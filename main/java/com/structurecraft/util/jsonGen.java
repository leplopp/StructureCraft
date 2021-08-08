package com.structurecraft.util;

import java.io.File;
import java.io.FileOutputStream;
import com.structurecraft.structurecraft;
import com.structurecraft.list.namelist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = structurecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class jsonGen {
	
    public static void genBlockstates() {
        for (String variant : namelist.mcvariants) {
            File slopeblockstates = new File("V:\\Java Workspace_Test\\Minecraft\\normal mods\\StructureCraft\\src\\main\\resources\\assets\\structurecraft\\blockstates\\" + "slopeobj_" + variant  + ".json");
            try (FileOutputStream out = new FileOutputStream(slopeblockstates, false)) {
                if (!slopeblockstates.exists())
                	slopeblockstates.createNewFile();
                		String output = 
                		"{ \"variants\":{\n" +
                        " 		\"facing=north,half=bottom,shape=outer_right\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=bottom,shape=outer_right\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=bottom,shape=outer_right\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"y\": 270, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=bottom,shape=outer_right\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=north,half=bottom,shape=outer_left\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=bottom,shape=outer_left\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"y\": 270, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=bottom,shape=outer_left\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=bottom,shape=outer_left\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=bottom,shape=inner_right\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"y\": 270, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=bottom,shape=inner_right\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=north,half=bottom,shape=inner_right\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=bottom,shape=inner_right\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=bottom,shape=inner_left\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=bottom,shape=inner_left\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=north,half=bottom,shape=inner_left\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"y\": 270, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=bottom,shape=inner_left\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=bottom,shape=straight\":  {\"model\":\"structurecraft:block/slopes/slopeobj_" + variant + "\",\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=bottom,shape=straight\":  {\"model\":\"structurecraft:block/slopes/slopeobj_" + variant + "\",\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=north,half=bottom,shape=straight\":  {\"model\":\"structurecraft:block/slopes/slopeobj_" + variant + "\",\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=bottom,shape=straight\":  {\"model\":\"structurecraft:block/slopes/slopeobj_" + variant + "\",\"y\": 270, \"uvlock\": true},\n" +
                        " 		\"facing=north,half=top,shape=outer_right\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"x\": 180,\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=top,shape=outer_right\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"x\": 180,\"y\": 270, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=top,shape=outer_right\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"x\": 180,\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=top,shape=outer_right\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"x\": 180,\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=north,half=top,shape=outer_left\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"x\": 180,\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=top,shape=outer_left\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"x\": 180,\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=top,shape=outer_left\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"x\": 180,\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=top,shape=outer_left\":  {\"model\":\"structurecraft:block/slopes/cornerout/corneroutobj_" + variant + "\",\"x\": 180,\"y\": 270, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=top,shape=inner_right\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"x\": 180,\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=top,shape=inner_right\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"x\": 180,\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=north,half=top,shape=inner_right\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"x\": 180,\"y\": 270, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=top,shape=inner_right\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"x\": 180,\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=top,shape=inner_left\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"x\": 180,\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=top,shape=inner_left\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"x\": 180,\"y\": 270, \"uvlock\": true},\n" +
                        " 		\"facing=north,half=top,shape=inner_left\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"x\": 180,\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=top,shape=inner_left\":  {\"model\":\"structurecraft:block/slopes/cornerin/cornerinobj_" + variant + "\",\"x\": 180,\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=north,half=top,shape=straight\":  {\"model\":\"structurecraft:block/slopes/slopeobj_" + variant + "\",\"x\": 180,\"y\": 180, \"uvlock\": true},\n" +
                        " 		\"facing=west,half=top,shape=straight\":  {\"model\":\"structurecraft:block/slopes/slopeobj_" + variant + "\",\"x\": 180,\"y\": 90, \"uvlock\": true},\n" +
                        " 		\"facing=south,half=top,shape=straight\":  {\"model\":\"structurecraft:block/slopes/slopeobj_" + variant + "\",\"x\": 180,\"y\": 0, \"uvlock\": true},\n" +
                        " 		\"facing=east,half=top,shape=straight\":  {\"model\":\"structurecraft:block/slopes/slopeobj_" + variant + "\",\"x\": 180,\"y\": 270, \"uvlock\": true}\n" +
                        "  }}";
                out.write(output.getBytes());
            } catch (Exception e) {}}}  
    public static void genModels() {
	            for (String variant : namelist.mcvariants) {
	                File modelslope = new File("V:\\Java Workspace_Test\\Minecraft\\normal mods\\StructureCraft\\src\\main\\resources\\assets\\structurecraft\\models\\block\\slopes\\" + "slopeobj_" + variant  + ".json");
	                try (FileOutputStream out = new FileOutputStream(modelslope, false)) {
	                    if (!modelslope.exists())
	                    	modelslope.createNewFile();
	                    		String output = "{\n" +
	                            "  	\"parent\": \"minecraft:block/cube_all\",\n" +
	                    		"	\"loader\": \"forge:obj\",\n" +
	                            "  	\"flip-v\": true,\n" +
	                    		"	\"model\": \"structurecraft:models/block/obj/slopeobjmain.obj\",\n" +
	                            "  	\"textures\": {\n" +
	                            "   \"materialtexture\": \"minecraft:block/" + variant + "\",\n" +
	                            "   \"particle\": \"minecraft:block/" + variant + "\"\n" +
	                            "  }}";
	                    out.write(output.getBytes());
	                } catch (Exception e) {}
	                File modelcornerin = new File("V:\\Java Workspace_Test\\Minecraft\\normal mods\\StructureCraft\\src\\main\\resources\\assets\\structurecraft\\models\\block\\slopes\\cornerin\\" + "cornerinobj_" + variant  + ".json");
	                try (FileOutputStream out = new FileOutputStream(modelcornerin, false)) {
	                    if (!modelcornerin.exists())
	                    	modelcornerin.createNewFile();
	                    		String output = "{\n" +
	                            "  	\"parent\": \"minecraft:block/cube_all\",\n" +
	                    		"	\"loader\": \"forge:obj\",\n" +
	                            "  	\"flip-v\": true,\n" +
	                    		"	\"model\": \"structurecraft:models/block/obj/cornerinobj_main.obj\",\n" +
	                            "  	\"textures\": {\n" +
	                            "   \"materialtexture\": \"minecraft:block/" + variant + "\",\n" +
	                            "   \"particle\": \"minecraft:block/" + variant + "\"\n" +
	                            "  }}";
	                    out.write(output.getBytes());
	                } catch (Exception e) {}
	                File modelcornerout = new File("V:\\Java Workspace_Test\\Minecraft\\normal mods\\StructureCraft\\src\\main\\resources\\assets\\structurecraft\\models\\block\\slopes\\cornerout\\\\" + "corneroutobj_" + variant  + ".json");
	                try (FileOutputStream out = new FileOutputStream(modelcornerout, false)) {
	                    if (!modelcornerout.exists())
	                    	modelcornerout.createNewFile();
	                    		String output = "{\n" +
	                            "  	\"parent\": \"minecraft:block/cube_all\",\n" +
	                    		"	\"loader\": \"forge:obj\",\n" +
	                            "  	\"flip-v\": true,\n" +
	                    		"	\"model\": \"structurecraft:models/block/obj/corneroutobj_main.obj\",\n" +
	                            "  	\"textures\": {\n" +
	                            "   \"materialtexture\": \"minecraft:block/" + variant + "\",\n" +
	                            "   \"particle\": \"minecraft:block/" + variant + "\"\n" +
	                            "  }}";
	                    out.write(output.getBytes());
	                } catch (Exception e) {}}}
	 public static void genItemModels() {
	        for (String variant : namelist.mcvariants) {
	            File slopeitem = new File("V:\\Java Workspace_Test\\Minecraft\\normal mods\\StructureCraft\\src\\main\\resources\\assets\\structurecraft\\models\\item\\" +  "slopeobj_" + variant + ".json");
	            try (FileOutputStream out = new FileOutputStream(slopeitem, false)) {
	                if (!slopeitem.exists())
	                	slopeitem.createNewFile();
	                		String output = "{\n" +
	                        "   \"parent\": \"structurecraft:block/slopes/slopeobj_" + variant + "\",\n" +
	                		"	\"display\": {\n" +
	                        "		\"gui\": {\n" +
	                		" 			\"rotation\": [ 30, 45, 0 ],\n" +
	                        "			\"scale\":[ 0.625, 0.625, 0.625 ]" +
	                        "}}}";
	                out.write(output.getBytes());
	            } catch (Exception e) {}
	       }
	  }
}