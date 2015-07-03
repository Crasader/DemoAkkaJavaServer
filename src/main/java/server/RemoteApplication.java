package server;

import akka.actor.ActorSystem;

import akka.actor.Props;
import akkaSystem.CreatorActor;
import akkaSystem.LookupActor;
import com.typesafe.config.ConfigFactory;

public class RemoteApplication {

  public static void main(String[] args) {


      ActorSystem remoteSystem = ActorSystem.create("remoteSystem",
              ConfigFactory.load(("remoteSystemConfiguration")));
      System.out.println("Started RemoteSystem");

          remoteSystem.actorOf(Props.create(CreatorActor.class), "creatorActor");
      remoteSystem.actorOf(Props.create(LookupActor.class), "lookupActor");

  }

}
